package defpackage;

import android.os.Build;
import android.util.Log;

/* renamed from: yiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yiw {
    private static final anax b = anax.a((Object) "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs", (Object) "https://tac.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
    public final String a;

    public yiw(String str) {
        if (!"user".equals(Build.TYPE)) {
            this.a = str;
        } else if (!b.contains(str)) {
            this.a = "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs";
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs").length());
            sb.append("Invalid URL provided for Heterodyne: ");
            sb.append(str);
            sb.append("; falling back to known valid URL: ");
            sb.append("https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
            Log.e("HeterodyneServiceUrl", sb.toString());
        } else {
            this.a = str;
        }
    }
}
