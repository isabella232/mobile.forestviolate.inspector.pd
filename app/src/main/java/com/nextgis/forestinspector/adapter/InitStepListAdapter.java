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


package com.nextgis.forestinspector.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nextgis.forestinspector.R;
import com.nextgis.forestinspector.util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * The list of initialize steps
 */
public class InitStepListAdapter extends BaseAdapter {

    protected List<InitStep> mSteps;
    protected Context mContext;

    public InitStepListAdapter(Context context) {
        mContext = context;
        mSteps = new ArrayList<>();

        // 1. check server
        InitStep step1 = new InitStep(context.getString(R.string.check_server),
                                      context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step1);

        // 2. get inspector detail
        InitStep step2 = new InitStep(context.getString(R.string.get_inspector_detailes),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step2);

        // 3. create base layers
        InitStep step3 = new InitStep(context.getString(R.string.create_base_layers),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step3);

        // 4. forest cadastre
        InitStep step4 = new InitStep(context.getString(R.string.get_forest_cadastre),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step4);

        // 5. load documents
        InitStep step5 = new InitStep(context.getString(R.string.load_documents),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step5);

        // 6. load linked tables
        InitStep step6 = new InitStep(context.getString(R.string.load_linked_layers),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step6);

        // 7. load notes
        InitStep step7 = new InitStep(context.getString(R.string.load_notes),
                context.getString(R.string.waiting), Constants.STEP_STATE_WAIT);
        mSteps.add(step7);

        // 8. load other offline vector data (scanex points, etc.)
    }

    @Override
    public int getCount() {
        return mSteps.size();
    }

    @Override
    public Object getItem(int position) {
        return mSteps.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (null == v) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            v = inflater.inflate(R.layout.row_initstep, null);
        }

        InitStep item = (InitStep) getItem(position);

        ImageView ivIcon = (ImageView) v.findViewById(R.id.ivIcon);
        switch (item.mState){
            case Constants.STEP_STATE_WAIT:
                ivIcon.setImageDrawable( mContext.getResources().getDrawable(R.drawable.ic_action_file_cloud_queue));
                break;
            case Constants.STEP_STATE_WORK:
                ivIcon.setImageDrawable( mContext.getResources().getDrawable(R.drawable.ic_action_file_cloud_download));
                break;
            case Constants.STEP_STATE_DONE:
                ivIcon.setImageDrawable( mContext.getResources().getDrawable(R.drawable.ic_action_file_cloud_done));
                break;
            case Constants.STEP_STATE_ERROR:
                ivIcon.setImageDrawable( mContext.getResources().getDrawable(R.drawable.ic_action_file_cloud_off));
                break;
        }

        TextView tvStep = (TextView) v.findViewById(R.id.tvName);
        tvStep.setText(item.mStepName);

        TextView tvDesc = (TextView) v.findViewById(R.id.tvDesc);
        tvDesc.setText(item.mStepDescription);

        return v;
    }

    public class InitStep {
        public String mStepName;
        public String mStepDescription;
        public int mState; //0 - wait, 1 - working, 2 - finished, 3 - error

        public InitStep(String stepName, String stepDescription, int state) {
            mStepDescription = stepDescription;
            mStepName = stepName;
            mState = state;
        }
    }
}
