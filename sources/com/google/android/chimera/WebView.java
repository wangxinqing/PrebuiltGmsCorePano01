package com.google.android.chimera;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WebView extends android.webkit.WebView {
    public WebView(Context context) {
        super(context);
        a(context);
    }

    private static final void a(Context context) {
        ModuleContext moduleContext;
        if (Build.VERSION.SDK_INT >= 24 && (moduleContext = ModuleContext.getModuleContext(context)) != null) {
            bms moduleApk = moduleContext.getModuleApk();
            if (!(moduleApk instanceof bkw)) {
                try {
                    ApplicationInfo overrideApplicationInfo = moduleContext.overrideApplicationInfo(moduleApk.a());
                    try {
                        new android.webkit.WebView(context);
                    } finally {
                        moduleContext.overrideApplicationInfo(overrideApplicationInfo);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String obj = moduleApk.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 77);
                    sb.append("Failed to obtain the resources for ");
                    sb.append(obj);
                    sb.append(". Skipping injection of WebView resources.");
                    Log.e("ChimeraWebView", sb.toString(), e);
                }
            }
        }
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        a(context);
    }
}
