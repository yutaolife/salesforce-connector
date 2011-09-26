/*
 * Copyright (c) 2005, salesforce.com, inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.sforce.ws.tools;

import com.sforce.ws.bind.TypeMapper;
import com.sforce.ws.wsdl.Enumeration;
import com.sforce.ws.wsdl.Schema;
import com.sforce.ws.wsdl.SimpleType;
import com.sforce.ws.wsdl.Types;

import java.io.File;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * SimpleTypeGenerator
 *
 * @author http://cheenath.com
 * @version 1.0
 * @since 1.0  Mar 7, 2006
 */
public class SimpleTypeGenerator extends TypeGenerator {
    private SimpleType simpleType;
    private static final String TEMPLATE = "com/sforce/ws/tools/simpleType.template";
    private TypeMapper typeMapper;
    private static final Pattern DASH_PATTERN = Pattern.compile("-");

    public SimpleTypeGenerator(Types types, Schema schema, SimpleType simpleType, File tempDir, TypeMapper typeMapper) {
        super(types, schema, simpleType.getName(), tempDir, typeMapper);
        this.simpleType = simpleType;
        this.typeMapper = typeMapper;
    }

    @Override
    protected String getTemplate() {
        return TEMPLATE;
    }

    public Iterator<Enumeration> getEnumeration() {
        return simpleType.getRestriction().getElements();
    }

    public String javaName(Enumeration enumeration) {
        String name = enumeration.getValue();
        int index = name.indexOf(":");
        String subname = index == -1 ? name : name.substring(index+1);
        if (typeMapper.isKeyWord(subname)) {
            subname = "_" + subname;
        }
        if (subname.indexOf("-") > 0) {
            subname = DASH_PATTERN.matcher(subname).replaceAll("_");
        }
        return subname;
    }
}
