package defpackage;

import android.provider.ContactsContract;

/* renamed from: abgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abgc implements abge {
    public static final abge a = new abgc();

    private abgc() {
    }

    public final int a(int i) {
        int i2;
        Integer num = (Integer) abgf.a.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 7;
        }
        return ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i2);
    }
}
