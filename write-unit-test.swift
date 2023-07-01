/*
The code originates from
https://github.com/SvenTiigi/ValidatedPropertyKit/blob/main/Sources/Validation/Validation%2BComparable.swift
*/
import Foundation

public extension Validation where Value: Comparable {
    
    static func less(
        _ comparableValue: @autoclosure @escaping () -> Value
    ) -> Self {
        .init { value in
            value < comparableValue()
        }
    }
    
    static func lessOrEqual(
        _ comparableValue: @autoclosure @escaping () -> Value
    ) -> Self {
        .init { value in
            value <= comparableValue()
        }
    }
    
    static func greater(
        _ comparableValue: @autoclosure @escaping () -> Value
    ) -> Self {
        .init { value in
            value > comparableValue()
        }
    }
    
    static func greaterOrEqual(
        _ comparableValue: @autoclosure @escaping () -> Value
    ) -> Self {
        .init { value in
            value >= comparableValue()
        }
    }
}
