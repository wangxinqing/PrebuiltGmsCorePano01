package defpackage;

import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: xbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbl extends xbo {
    public xbl(Resources resources) {
        super(resources);
    }

    /* access modifiers changed from: protected */
    public final String a(Resources resources, int i) {
        return (String) ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i, (CharSequence) null);
    }
}
