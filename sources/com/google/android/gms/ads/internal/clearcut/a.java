package com.google.android.gms.ads.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a {
    public int a;
    public int b;
    final /* synthetic */ b c;
    private final byte[] d;

    public a(b bVar, byte[] bArr) {
        this.c = bVar;
        this.d = bArr;
    }

    public final synchronized void a() {
        try {
            b bVar = this.c;
            if (bVar.a) {
                com.google.android.gms.ads.clearcut.a aVar = bVar.b;
                byte[] bArr = this.d;
                Parcel aQ = aVar.aQ();
                aQ.writeByteArray(bArr);
                aVar.b(5, aQ);
                com.google.android.gms.ads.clearcut.a aVar2 = this.c.b;
                int i = this.a;
                Parcel aQ2 = aVar2.aQ();
                aQ2.writeInt(i);
                aVar2.b(6, aQ2);
                com.google.android.gms.ads.clearcut.a aVar3 = this.c.b;
                int i2 = this.b;
                Parcel aQ3 = aVar3.aQ();
                aQ3.writeInt(i2);
                aVar3.b(7, aQ3);
                com.google.android.gms.ads.clearcut.a aVar4 = this.c.b;
                Parcel aQ4 = aVar4.aQ();
                aQ4.writeIntArray((int[]) null);
                aVar4.b(4, aQ4);
                com.google.android.gms.ads.clearcut.a aVar5 = this.c.b;
                aVar5.b(3, aVar5.aQ());
            }
        } catch (RemoteException e) {
            c.a("Clearcut log failed", e);
        }
    }
}
