package defpackage;

import android.provider.ContactsContract;

/* renamed from: abgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abgd implements abge {
    public static final abge a = new abgd();

    private abgd() {
    }

    public final int a(int i) {
        int i2;
        Integer num = (Integer) abgf.b.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        return ContactsContract.CommonDataKinds.Email.getTypeLabelResource(i2);
    }
}
