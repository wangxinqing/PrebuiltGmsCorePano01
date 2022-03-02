package defpackage;

import android.content.Context;

/* renamed from: ikt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ikt extends ikz {
    public ikt(String str, Boolean bool) {
        super(str, bool);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        iky iky = ikz.d;
        return Boolean.valueOf(aeeg.a(iky.a, this.b, ((Boolean) this.c).booleanValue()));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Context context, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        String string = b(context).getString(str, (String) null);
        if (string == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        } catch (NumberFormatException e) {
            return bool;
        }
    }
}
