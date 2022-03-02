package com.google.android.gms.romanesco.service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsLoggerUploadService extends qwf {
    public static final zsg a = zsg.a("ContactsLoggerService");
    public final amqy b;
    public final amrm c;

    public ContactsLoggerUploadService() {
        this.b = new zyl(this);
        this.c = new zym(this);
    }

    private final int a(afuk afuk, boolean z) {
        qyq a2 = ztg.a(getApplicationContext()).a((avew) afuk.a());
        return a2.a(a2.a(new zyn(this, z), afuk.b(), aoqm.a), afuk.b(), zyo.a);
    }

    ContactsLoggerUploadService(amqy amqy, amrm amrm) {
        this.b = amqy;
        this.c = amrm;
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        new Object[1][0] = str;
        if (azem.b()) {
            afuk a2 = ztg.a.a(str);
            avew avew = avew.SYNC_ID_UNKNOWN;
            int ordinal = ((avew) a2.a()).ordinal();
            if (ordinal == 1) {
                return a(a2, true);
            }
            if (ordinal == 2) {
                return a(a2, false);
            }
        }
        a.c("Ignoring task with unknown tag");
        return 2;
    }
}
