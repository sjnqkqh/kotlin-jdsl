package com.linecorp.kotlinjdsl.dsl.jpql.entity.employee

abstract class Employee(
    val employeeId: Long,
    val name: String,
    val nickname: String?,
    val age: Int,
    val phone: String,
    val address: EmployeeAddress,
    val departments: MutableSet<EmployeeDepartment>,
) {
    fun getDisplayName() = nickname ?: name
}
