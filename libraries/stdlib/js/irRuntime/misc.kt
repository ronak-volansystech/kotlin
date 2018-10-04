/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin.js

// TODO: Polyfill
fun imul(a: dynamic, b: dynamic) =
    js("((a & 0xffff0000) * (b & 0xffff) + (a & 0xffff) * (b | 0)) | 0")