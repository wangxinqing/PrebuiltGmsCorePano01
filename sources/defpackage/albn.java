package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;

/* renamed from: albn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class albn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    private final Context k;

    public albn(Context context, Intent intent, ComponentName componentName) {
        iva.a((Object) context);
        this.k = context;
        iva.a((Object) componentName);
        String packageName = componentName.getPackageName();
        iva.a((Object) packageName);
        this.a = packageName;
        componentName.getShortClassName();
        PackageInfo packageInfo = null;
        try {
            packageInfo = jni.b(this.k).b(this.a, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (Log.isLoggable("Places", 5)) {
                String valueOf = String.valueOf(this.a);
                alfy.c("Places", valueOf.length() == 0 ? new String("Could not find package info for package: ") : "Could not find package info for package: ".concat(valueOf));
            }
        }
        if (packageInfo != null) {
            int i2 = packageInfo.versionCode;
        }
        Bundle extras = intent.getExtras();
        extras = extras == null ? Bundle.EMPTY : extras;
        this.c = extras.getString("account_name");
        this.b = extras.getString("alias_title");
        this.d = extras.getString("gcore_client_name");
        this.e = extras.getInt("primary_color");
        this.f = extras.getInt("primary_color_dark");
        if (intent.hasExtra("primary_color")) {
            this.g = akyq.a(this.e, context.getResources().getColor(R.color.text_white_alpha_87), context.getResources().getColor(R.color.text_black_alpha_87));
        } else {
            this.g = 0;
        }
        this.h = extras.getInt("reference_marker_overlay_resource_id", -1);
        this.i = extras.getInt("reference_marker_overlay_width_meters");
        this.j = extras.getInt("reference_marker_overlay_height_meters");
    }
}
