/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.graal.python.builtins.objects.cext.hpy;

import java.util.Arrays;

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.nodes.ExplodeLoop;

/**
 * Definitions for legacy slots.
 */
public abstract class GraalHPyLegacyDef {
    public static final int MEMBER_FLAG_READONLY = 1;

    /**
     * Values for field {@code slot} of structure {@code PyType_Slot}.
     */
    enum HPyLegacySlot {
        Py_mp_ass_subscript(3),
        Py_mp_length(4),
        Py_mp_subscript(5),
        Py_nb_absolute(6),
        Py_nb_add(7),
        Py_nb_and(8),
        Py_nb_bool(9),
        Py_nb_divmod(10),
        Py_nb_float(11),
        Py_nb_floor_divide(12),
        Py_nb_index(13),
        Py_nb_inplace_add(14),
        Py_nb_inplace_and(15),
        Py_nb_inplace_floor_divide(16),
        Py_nb_inplace_lshift(17),
        Py_nb_inplace_multiply(18),
        Py_nb_inplace_or(19),
        Py_nb_inplace_power(20),
        Py_nb_inplace_remainder(21),
        Py_nb_inplace_rshift(22),
        Py_nb_inplace_subtract(23),
        Py_nb_inplace_true_divide(24),
        Py_nb_inplace_xor(25),
        Py_nb_int(26),
        Py_nb_invert(27),
        Py_nb_lshift(28),
        Py_nb_multiply(29),
        Py_nb_negative(30),
        Py_nb_or(31),
        Py_nb_positive(32),
        Py_nb_power(33),
        Py_nb_remainder(34),
        Py_nb_rshift(35),
        Py_nb_subtract(36),
        Py_nb_true_divide(37),
        Py_nb_xor(38),
        Py_sq_ass_item(39),
        Py_sq_concat(40),
        Py_sq_contains(41),
        Py_sq_inplace_concat(42),
        Py_sq_inplace_repeat(43),
        Py_sq_item(44),
        Py_sq_length(45),
        Py_sq_repeat(46),
        Py_tp_alloc(47),
        Py_tp_base(48),
        Py_tp_bases(49),
        Py_tp_call(50),
        Py_tp_clear(51),
        Py_tp_dealloc(52),
        Py_tp_del(53),
        Py_tp_descr_get(54),
        Py_tp_descr_set(55),
        Py_tp_doc(56),
        Py_tp_getattr(57),
        Py_tp_getattro(58),
        Py_tp_hash(59),
        Py_tp_init(60),
        Py_tp_is_gc(61),
        Py_tp_iter(62),
        Py_tp_iternext(63),
        Py_tp_methods(64),
        Py_tp_new(65),
        Py_tp_repr(66),
        Py_tp_richcompare(67),
        Py_tp_setattr(68),
        Py_tp_setattro(69),
        Py_tp_str(70),
        Py_tp_traverse(71),
        Py_tp_members(72),
        Py_tp_getset(73),
        Py_tp_free(74),
        Py_nb_matrix_multiply(75),
        Py_nb_inplace_matrix_multiply(76),
        Py_am_await(77),
        Py_am_aiter(78),
        Py_am_anext(79);

        /** The corresponding C enum value. */
        private final int value;

        HPyLegacySlot(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }

        @CompilationFinal(dimensions = 1) private static final HPyLegacySlot[] VALUES = Arrays.copyOf(values(), values().length);

        @ExplodeLoop
        static HPyLegacySlot fromValue(int value) {
            for (int i = 0; i < VALUES.length; i++) {
                if (VALUES[i].value == value) {
                    return VALUES[i];
                }
            }
            return null;
        }
    }
}
