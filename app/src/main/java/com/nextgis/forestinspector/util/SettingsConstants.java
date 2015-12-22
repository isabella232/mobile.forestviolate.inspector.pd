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

public interface SettingsConstants
{
    String AUTHORITY             = "com.nextgis.forestinspector.provider";
    String SITE_URL = "http://176.9.38.120/fv";
    String KOSOSNIMKI_URL = "http://{a,b,c}.tile.cart.kosmosnimki.ru/rs/{z}/{x}/{y}.png";
    String VIOLATIONS_URL = "http://maps.kosmosnimki.ru/TileService.ashx?request=gettile&layername=15CBBFB4151E48ECAE0F699FD4F9223A&srs=EPSG:3857&z={z}&x={x}&y={y}&format=png&Map=1D116AC56D694C0B8CDCA87C06D1961A";

    /**
     * user account settings
     */
    String KEY_PREF_USER = "user";
    String KEY_PREF_USERDESC = "user_desc";
    String KEY_PREF_USERID = "user_id";
    String KEY_PREF_USERMINX = "user_minx";
    String KEY_PREF_USERMINY = "user_miny";
    String KEY_PREF_USERMAXX = "user_maxx";
    String KEY_PREF_USERMAXY = "user_maxy";

    /**
     * map preference
     */
    String KEY_PREF_COORD_FORMAT = "coordinates_format";

    /**
     * Preference key - not UI
     */
    String KEY_PREF_SCROLL_X      = "map_scroll_x";
    String KEY_PREF_SCROLL_Y      = "map_scroll_y";
    String KEY_PREF_ZOOM_LEVEL    = "map_zoom_level";
    String KEY_PREF_SHOW_LOCATION = "map_show_loc";
    String KEY_PREF_SHOW_COMPASS  = "map_show_compass";
    String KEY_PREF_SHOW_INFO     = "map_show_info";

    /**
     * Preference keys - in UI
     */
    String KEY_PREF_STORAGE_SITE        = "storage_site";
    String KEY_PREF_MIN_DIST_CHNG_UPD   = "min_dist_change_for_update";
    String KEY_PREF_MIN_TIME_UPD        = "min_time_beetwen_updates";
    String KEY_PREF_SW_TRACK_SRV        = "sw_track_service";
    String KEY_PREF_SW_TRACKGPX_SRV     = "sw_trackgpx_service";
    String KEY_PREF_SHOW_LAYES_LIST     = "show_layers_list";
    String KEY_PREF_SW_SENDPOS_SRV      = "sw_sendpos_service";
    String KEY_PREF_SW_ENERGY_ECO       = "sw_energy_economy";
    String KEY_PREF_TIME_DATASEND       = "time_between_datasend";
    String KEY_PREF_ACCURATE_LOC        = "accurate_coordinates_pick";
    String KEY_PREF_ACCURATE_GPSCOUNT   = "accurate_coordinates_pick_count";
    String KEY_PREF_ACCURATE_CE         = "accurate_type";
    String KEY_PREF_TILE_SIZE           = "map_tile_size";
    String KEY_PREF_COMPASS_VIBRO       = "compass_vibration";
    String KEY_PREF_COMPASS_TRUE_NORTH  = "compass_true_north";
    String KEY_PREF_COMPASS_SHOW_MAGNET = "compass_show_magnetic";
    String KEY_PREF_COMPASS_WAKE_LOCK   = "compass_wake_lock";
    String KEY_PREF_SHOW_ZOOM_CONTROLS  = "show_zoom_controls";
}
