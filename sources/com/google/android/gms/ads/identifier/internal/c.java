package com.google.android.gms.ads.identifier.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.identifier.settings.e;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends bhw implements d {
    private final e a;
    private final Context b;

    public c() {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String a(String str) {
        jhg.c(this.b, str);
        hya.a(this.b).a(str);
        Intent startIntent = IntentOperation.getStartIntent(this.b, "com.google.android.gms.ads.cache.ClearCacheIntentOperation", "com.google.android.gms.ads.cache.CLEAR");
        if (startIntent != null) {
            this.b.startService(startIntent);
        }
        return this.a.b();
    }

    public final String b() {
        return this.a.c();
    }

    public final boolean c() {
        return this.a.i();
    }

    public final String b(String str, boolean z) {
        String str2;
        String str3;
        jhg.c(this.b, str);
        hya.a(this.b).a(str);
        if (!z) {
            e eVar = this.a;
            synchronized (eVar.a) {
                if (!eVar.f()) {
                    str3 = eVar.h();
                    if (str3.isEmpty()) {
                    }
                }
                String h = eVar.h();
                if (h.isEmpty()) {
                    h = UUID.randomUUID().toString();
                }
                str3 = eVar.a(false, eVar.d(), h, "");
            }
            return str3;
        }
        e eVar2 = this.a;
        synchronized (eVar2.a) {
            if (eVar2.f()) {
                str2 = eVar2.g();
                if (!str2.isEmpty()) {
                }
            }
            str2 = eVar2.a(true, eVar2.d(), eVar2.h(), eVar2.e());
        }
        return str2;
    }

    public c(byte[] bArr) {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        ihs b2 = ihs.b();
        this.b = b2;
        this.a = e.a((Context) b2);
    }

    public final void a(String str, boolean z) {
        jhg.c(this.b, str);
        hya.a(this.b).a(str);
        this.a.a(z);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                String b2 = b();
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 2:
                bhx.a(parcel);
                boolean c = c();
                parcel2.writeNoException();
                bhx.a(parcel2, c);
                return true;
            case 3:
                String a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 4:
                a(parcel.readString(), bhx.a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                String b3 = b(parcel.readString(), bhx.a(parcel));
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 6:
                boolean f = this.a.f();
                parcel2.writeNoException();
                bhx.a(parcel2, f);
                return true;
            default:
                return false;
        }
    }
}
