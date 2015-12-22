/*
 * Project: Forest violations
 * Purpose: Mobile application for registering facts of the forest violations.
 * Author:  Dmitry Baryshnikov (aka Bishop), bishop.dev@gmail.com
 * *****************************************************************************
 * Copyright (c) 2015-2015. NextGIS, info@nextgis.com
 *
 * This is free and unencumbered software released into the public domain.
 * 
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * 
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * 
 * For more information, please refer to <http://unlicense.org>
 */


package com.nextgis.forestinspector.util;

/**
 * Constants
 */
public interface Constants {

    String KEY_INSPECTORS = "inspectors";
    String KEY_DOCUMENTS = "docs";
    String KEY_SHEET = "sheet";
    String KET_PRODUCTION = "production";
    String KEY_NOTES = "notes";
    String KEY_TERRITORY = "territory";
    String KEY_VEHICLES = "vehicles";
    String KEY_CADASTRE = "cadastre";

    String KEY_LAYER_DOCUMENTS = "documents";
    String KEY_LAYER_SHEET = "sheet";
    String KEY_LAYER_PRODUCTION = "production";
    String KEY_LAYER_NOTES = "notes";
    String KEY_LAYER_TERRITORY = "territory";
    String KEY_LAYER_VEHICLES = "vehicles";
    String KEY_LAYER_CADASTRE = "cadastre";

    /**
     * inspectors keys
     */
    String KEY_INSPECTOR_USER = "user";
    String KEY_INSPECTOR_USER_DESC = "user_desc";

    /**
     * notes keys
     */
    String KEY_NOTES_USERID = "user_id";

    /**
     * document types
     */
    int TYPE_DOCUMENT = 2;
    int TYPE_SHEET = 3;
    int TYPE_NOTE = 0;

    int STEP_STATE_WAIT = 0;
    int STEP_STATE_WORK = 1;
    int STEP_STATE_DONE = 2;
    int STEP_STATE_ERROR = 3;

    String FIELD_DOCUMENTS_TYPE = "type";
    String FIELD_DOCUMENTS_DATE = "date";
    String FIELD_DOCUMENTS_NUMBER = "number";
    String FIELD_DOCUMENTS_STATUS = "status";
    String FIELD_DOCUMENTS_VIOLATE = "violate";

    String FIELD_NOTES_DATE_BEG = "date_beg";
    String FIELD_NOTES_DATE_END = "date_end";
    String FIELD_NOTES_DESCRIPTION = "descript";
}
