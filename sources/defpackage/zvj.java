package defpackage;

import com.google.android.gms.romanesco.contactsupload.triggers.ContactsLoggerIntentOperation;

/* renamed from: zvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zvj implements amqy {
    private final avew a;

    public zvj(avew avew) {
        this.a = avew;
    }

    public final Object a(Object obj) {
        String str;
        avew avew = this.a;
        zsg zsg = ContactsLoggerIntentOperation.a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(avew.d);
        if (!((Boolean) obj).booleanValue()) {
            str = "disabled";
        } else {
            str = "scheduled";
        }
        objArr[1] = str;
        zsg.a("SPE one-time sync %d %s", objArr);
        return null;
    }
}
