package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.R;

/* renamed from: ivr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivr {
    private final Resources a;
    private final String b;

    public ivr(Context context) {
        iva.a((Object) context);
        Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier != 0) {
            return this.a.getString(identifier);
        }
        return null;
    }
}
