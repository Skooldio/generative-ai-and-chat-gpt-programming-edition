private fun lockDevice() {
    val manager = getSystemService(DeviceLockManager::class.java)
    manager.lockDevice(Executors.newFixedThreadPool(1)) {
        setLockDeviceButtonState(true)
    }
}

private fun unlockDevice() {
    val manager = getSystemService(DeviceLockManager::class.java)
    manager.unlockDevice(Executors.newFixedThreadPool(1)) {
        setLockDeviceButtonState(false)
    }
}