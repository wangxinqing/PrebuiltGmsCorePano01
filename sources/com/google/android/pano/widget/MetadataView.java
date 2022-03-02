package com.google.android.pano.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MetadataView extends FrameLayout {
    protected Handler a = new qvr();
    protected Runnable b = new akfw(this);

    public MetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getResources();
        LayoutInflater.from(getContext()).inflate(R.layout.default_metadata_view, this, true);
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.album);
        TextView textView3 = (TextView) findViewById(R.id.artist);
        ImageView imageView = (ImageView) findViewById(R.id.art);
        this.a.post(this.b);
    }
}
