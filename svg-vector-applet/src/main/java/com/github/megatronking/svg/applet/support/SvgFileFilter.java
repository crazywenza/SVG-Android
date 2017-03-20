/*
 * Copyright (C) 2017, Megatron King
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.megatronking.svg.applet.support;

import com.github.megatronking.svg.applet.R;

import java.io.File;
import java.util.Locale;

import javax.swing.filechooser.FileFilter;

public class SvgFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getName().toLowerCase(Locale.US).endsWith(".svg") || f.getName().toLowerCase(Locale.US).endsWith(".svgz");
    }

    @Override
    public String getDescription() {
        return R.string.svg_filter;
    }
}
