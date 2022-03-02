package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: xqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xqb implements Callable {
    private final PeopleGalChimeraProvider a;
    private final Uri b;
    private final Account c;
    private final aucd d;

    public xqb(PeopleGalChimeraProvider peopleGalChimeraProvider, Uri uri, Account account, aucd aucd) {
        this.a = peopleGalChimeraProvider;
        this.b = uri;
        this.c = account;
        this.d = aucd;
    }

    public final Object call() {
        int i;
        byte[] bArr;
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.a;
        Uri uri = this.b;
        Account account = this.c;
        aucd aucd = this.d;
        String queryParameter = uri.getQueryParameter("lookup");
        if (queryParameter == null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj = (xlj) aucd.b;
            xlj xlj2 = xlj.g;
            xlj.c = 6;
            xlj.a |= 2;
            Log.e("PeopleGalProvider", "Lookup key cannot be null");
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("sz");
        ClientContext a2 = peopleGalChimeraProvider.a(account);
        xpp xpp = peopleGalChimeraProvider.a;
        if (queryParameter2 == null) {
            i = (int) ayuk.a.a().i();
        } else {
            i = (int) ayuk.h();
        }
        aucd o = aqvt.e.o();
        aucd o2 = aqwp.d.o();
        aucd o3 = aqwo.b.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ((aqwo) o3.b).c = true;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqwo aqwo = (aqwo) o3.i();
        aqwo.getClass();
        ((aqwp) o2.b).b = aqwo;
        aucd a3 = xpx.a();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqur aqur = (aqur) a3.i();
        aqur.getClass();
        ((aqwp) o2.b).a = aqur;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwp aqwp = (aqwp) o2.i();
        aqwp.getClass();
        ((aqvt) o.b).d = aqwp;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aqvt) o.b).a = aqwt.a(4);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqvt aqvt = (aqvt) o.b;
        queryParameter.getClass();
        aqvt.b = queryParameter;
        aqvt.f = true;
        aucd o4 = aqws.c.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqws aqws = (aqws) o4.b;
        aqws.b = i;
        aqws.a = i;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqws aqws2 = (aqws) o4.i();
        aqws2.getClass();
        ((aqvt) o.b).c = aqws2;
        try {
            bArr = xpp.a(a2, (aqvt) o.i()).a.k();
        } catch (eif e) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj3 = (xlj) aucd.b;
            xlj xlj4 = xlj.g;
            xlj3.c = 3;
            xlj3.a |= 2;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
            sb.append("Error getPersonPhotoEncodedResponse grpc response: ");
            sb.append(valueOf);
            Log.e("PeopleGalProvider", sb.toString());
            bArr = null;
        } catch (babk e2) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj5 = (xlj) aucd.b;
            xlj xlj6 = xlj.g;
            xlj5.c = 14;
            int i2 = xlj5.a | 2;
            xlj5.a = i2;
            int i3 = e2.a.r.r;
            xlj5.a = i2 | 16;
            xlj5.f = i3;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("Error getPersonPhotoEncodedResponse grpc response: ");
            sb2.append(valueOf2);
            Log.e("PeopleGalProvider", sb2.toString());
            bArr = null;
        }
        if (bArr == null) {
            Log.e("PeopleGalProvider", "Can't get GetPersonPhotoEncoded grpc response");
            return null;
        }
        try {
            return peopleGalChimeraProvider.openPipeHelper(uri, (String) null, (Bundle) null, new ByteArrayInputStream(bArr), new xqe(aucd));
        } catch (FileNotFoundException e3) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xlj xlj7 = (xlj) aucd.b;
            xlj xlj8 = xlj.g;
            xlj7.c = 11;
            xlj7.a |= 2;
            Log.e("PeopleGalProvider", "Cannot find file for the photo.");
            return null;
        }
    }
}
