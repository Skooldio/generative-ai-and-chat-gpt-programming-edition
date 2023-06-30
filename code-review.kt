class ValidateMenuAddingUseCase(
    private val getMenuUseCase: GetMenuUseCase,
) : UseCase<ValidateMenuAddingUseCase.Param, Menu?> {

    data class Param(
        val merchantId: String?,
        val menu: Menu?
    )

    override suspend fun execute(params: Param?): Menu? {
        params?.apply {
            if (merchantId == null || menu == null) return@apply

            val response = getMenuUseCase.execute(getMenuUseCase.Params(merchantId = merchantId))

            var result: Menu? = null
            if (menu.price == null) {
                response?.groups?.forEach { group ->
                    val sameItem = group.items?.find { it.name == menu.name }
                    if (sameItem != null) {
                        result = menu.copy(price = sameItem.price)
                    }
                }
            }
            if (result == null) {
                result = menu
            }
            return result
        }
        return null
    }
}