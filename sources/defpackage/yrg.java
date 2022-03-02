package defpackage;

import android.content.Context;
import android.util.Patterns;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: yrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrg extends Loader {
    public yrg(Context context) {
        super(context);
    }

    public final void a(String str) {
        if (str == null || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            deliverResult((Object) null);
        } else {
            deliverResult(ixa.a(AudienceMember.a(str, str)));
        }
    }
}
