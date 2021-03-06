/* MIT License
 *
 * Copyright (c) 2020, Oracle and/or its affiliates.
 * Copyright (c) 2019 pyhandle
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

#ifndef HPY_UNIVERSAL_TYPESLOTS_H
#define HPY_UNIVERSAL_TYPESLOTS_H

/* These magic numbers are the same as CPython */
typedef enum {
    HPy_mp_ass_subscript = 3,
    HPy_mp_length = 4,
    HPy_mp_subscript = 5,
    HPy_nb_absolute = 6,
    HPy_nb_add = 7,
    HPy_nb_and = 8,
    HPy_nb_bool = 9,
    HPy_nb_divmod = 10,
    HPy_nb_float = 11,
    HPy_nb_floor_divide = 12,
    HPy_nb_index = 13,
    HPy_nb_inplace_add = 14,
    HPy_nb_inplace_and = 15,
    HPy_nb_inplace_floor_divide = 16,
    HPy_nb_inplace_lshift = 17,
    HPy_nb_inplace_multiply = 18,
    HPy_nb_inplace_or = 19,
    HPy_nb_inplace_power = 20,
    HPy_nb_inplace_remainder = 21,
    HPy_nb_inplace_rshift = 22,
    HPy_nb_inplace_subtract = 23,
    HPy_nb_inplace_true_divide = 24,
    HPy_nb_inplace_xor = 25,
    HPy_nb_int = 26,
    HPy_nb_invert = 27,
    HPy_nb_lshift = 28,
    HPy_nb_multiply = 29,
    HPy_nb_negative = 30,
    HPy_nb_or = 31,
    HPy_nb_positive = 32,
    HPy_nb_power = 33,
    HPy_nb_remainder = 34,
    HPy_nb_rshift = 35,
    HPy_nb_subtract = 36,
    HPy_nb_true_divide = 37,
    HPy_nb_xor = 38,
    HPy_sq_ass_item = 39,
    HPy_sq_concat = 40,
    HPy_sq_contains = 41,
    HPy_sq_inplace_concat = 42,
    HPy_sq_inplace_repeat = 43,
    HPy_sq_item = 44,
    HPy_sq_length = 45,
    HPy_sq_repeat = 46,
    HPy_tp_alloc = 47,
    HPy_tp_base = 48,
    HPy_tp_bases = 49,
    HPy_tp_call = 50,
    HPy_tp_clear = 51,
    HPy_tp_dealloc = 52,
    HPy_tp_del = 53,
    HPy_tp_descr_get = 54,
    HPy_tp_descr_set = 55,
    HPy_tp_doc = 56,
    HPy_tp_getattr = 57,
    HPy_tp_getattro = 58,
    HPy_tp_hash = 59,
    HPy_tp_init = 60,
    HPy_tp_is_gc = 61,
    HPy_tp_iter = 62,
    HPy_tp_iternext = 63,
    HPy_tp_methods = 64,
    HPy_tp_new = 65,
    HPy_tp_repr = 66,
    HPy_tp_richcompare = 67,
    HPy_tp_setattr = 68,
    HPy_tp_setattro = 69,
    HPy_tp_str = 70,
    HPy_tp_traverse = 71,
    HPy_tp_members = 72,
    HPy_tp_getset = 73,
    HPy_tp_free = 74,
    HPy_nb_matrix_multiply = 75,
    HPy_nb_inplace_matrix_multiply = 76,
    HPy_am_await = 77,
    HPy_am_aiter = 78,
    HPy_am_anext = 79,
    HPy_tp_finalize = 80
} HPySlot_Slot;

#endif // HPY_UNIVERSAL_TYPESLOTS_H
