package defpackage;

import android.content.Context;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;

/* renamed from: zym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zym implements amrm {
    private final ContactsLoggerUploadService a;

    public zym(ContactsLoggerUploadService contactsLoggerUploadService) {
        this.a = contactsLoggerUploadService;
    }

    public final boolean a(Object obj) {
        Context applicationContext = this.a.getApplicationContext();
        return zul.a(applicationContext, new zve(applicationContext), new gsa(applicationContext), (zuk) obj);
    }
}
