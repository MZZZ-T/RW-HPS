/*
 * Copyright 2020-2022 RW-HPS Team and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/RW-HPS/RW-HPS/blob/master/LICENSE
 */

package com.github.dr.rwserver.game.simulation

import com.github.dr.rwserver.io.input.GameInputStream
import com.github.dr.rwserver.io.output.GameOutputStream
import java.io.IOException

interface SyncedObject {
    @Throws(IOException::class)
    fun readIn(inputNetStream: GameInputStream)

    @Throws(IOException::class)
    fun writeOut(outputNetStream: GameOutputStream)
}