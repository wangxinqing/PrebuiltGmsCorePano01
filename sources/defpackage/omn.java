package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: omn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omn extends oga {
    private final String a;

    public omn(Context context, HelpConfig helpConfig, String str, aoru aoru, okc okc) {
        super(context, helpConfig, aoru, okc, 182);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axmx.a.a().a());
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().d()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        if (!TextUtils.isEmpty(this.a)) {
            nzw.g = this.a;
        }
    }
}
