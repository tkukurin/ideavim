/*
 * Copyright 2003-2023 The IdeaVim authors
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE.txt file or at
 * https://opensource.org/licenses/MIT.
 */

package com.maddyhome.idea.vim.regexp.match

public sealed class VimMatchResult {
  public data class Success(
    public val range: IntRange,
    public val value: String,
    public val groups: VimMatchGroupCollection
  ) : VimMatchResult()

  public object Failure : VimMatchResult()
}