package com.knear.android.provider.response.protocolconfig

data class ExtCosts(
    val base: Int,
    val contract_compile_base: Int,
    val contract_compile_bytes: Int,
    val keccak256_base: Long,
    val keccak256_byte: Int,
    val keccak512_base: Long,
    val keccak512_byte: Int,
    val log_base: Long,
    val log_byte: Int,
    val promise_and_base: Int,
    val promise_and_per_promise: Int,
    val promise_return: Int,
    val read_memory_base: Long,
    val read_memory_byte: Int,
    val read_register_base: Long,
    val read_register_byte: Int,
    val sha256_base: Long,
    val sha256_byte: Int,
    val storage_has_key_base: Long,
    val storage_has_key_byte: Int,
    val storage_iter_create_from_byte: Int,
    val storage_iter_create_prefix_base: Int,
    val storage_iter_create_prefix_byte: Int,
    val storage_iter_create_range_base: Int,
    val storage_iter_create_to_byte: Int,
    val storage_iter_next_base: Int,
    val storage_iter_next_key_byte: Int,
    val storage_iter_next_value_byte: Int,
    val storage_read_base: Long,
    val storage_read_key_byte: Int,
    val storage_read_value_byte: Int,
    val storage_remove_base: Long,
    val storage_remove_key_byte: Int,
    val storage_remove_ret_value_byte: Int,
    val storage_write_base: Long,
    val storage_write_evicted_byte: Int,
    val storage_write_key_byte: Int,
    val storage_write_value_byte: Int,
    val touching_trie_node: Long,
    val utf16_decoding_base: Long,
    val utf16_decoding_byte: Int,
    val utf8_decoding_base: Long,
    val utf8_decoding_byte: Int,
    val validator_stake_base: Long,
    val validator_total_stake_base: Long,
    val write_memory_base: Long,
    val write_memory_byte: Int,
    val write_register_base: Long,
    val write_register_byte: Int
)
