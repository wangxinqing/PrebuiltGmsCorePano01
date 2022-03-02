package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vdr();
    final int a;
    public final vcf b;
    public final Strategy c;
    public final vci d;
    public final MessageFilter e;
    public final PendingIntent f;
    @Deprecated
    public final int g;
    @Deprecated
    public final String h;
    @Deprecated
    public final String i;
    public final byte[] j;
    @Deprecated
    public final boolean k;
    public final vcq l;
    @Deprecated
    public final boolean m;
    @Deprecated
    public final ClientAppContext n;
    public final boolean o;
    public final int p;
    public final int q;

    /* JADX WARNING: type inference failed for: r1v14, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SubscribeRequest(int r11, android.os.IBinder r12, com.google.android.gms.nearby.messages.Strategy r13, android.os.IBinder r14, com.google.android.gms.nearby.messages.MessageFilter r15, android.app.PendingIntent r16, int r17, java.lang.String r18, java.lang.String r19, byte[] r20, boolean r21, android.os.IBinder r22, boolean r23, com.google.android.gms.nearby.messages.internal.ClientAppContext r24, boolean r25, int r26, int r27) {
        /*
            r10 = this;
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r10.<init>()
            r7 = r11
            r0.a = r7
            r7 = 0
            if (r1 == 0) goto L_0x0027
            java.lang.String r8 = "com.google.android.gms.nearby.messages.internal.IMessageListener"
            android.os.IInterface r8 = r12.queryLocalInterface(r8)
            boolean r9 = r8 instanceof defpackage.vcf
            if (r9 == 0) goto L_0x0021
            vcf r8 = (defpackage.vcf) r8
            goto L_0x0028
        L_0x0021:
            vcd r8 = new vcd
            r8.<init>(r12)
            goto L_0x0028
        L_0x0027:
            r8 = r7
        L_0x0028:
            r0.b = r8
            r1 = r13
            r0.c = r1
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"
            android.os.IInterface r1 = r14.queryLocalInterface(r1)
            boolean r8 = r1 instanceof defpackage.vci
            if (r8 == 0) goto L_0x003c
            vci r1 = (defpackage.vci) r1
            goto L_0x0043
        L_0x003c:
            vcg r1 = new vcg
            r1.<init>(r14)
            goto L_0x0043
        L_0x0042:
            r1 = r7
        L_0x0043:
            r0.d = r1
            r1 = r15
            r0.e = r1
            r1 = r16
            r0.f = r1
            r1 = r17
            r0.g = r1
            r0.h = r3
            r0.i = r4
            r1 = r20
            r0.j = r1
            r1 = r21
            r0.k = r1
            if (r5 == 0) goto L_0x0072
            java.lang.String r1 = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.vcq
            if (r2 == 0) goto L_0x006c
            r7 = r1
            vcq r7 = (defpackage.vcq) r7
            goto L_0x0073
        L_0x006c:
            vco r7 = new vco
            r7.<init>(r5)
            goto L_0x0073
        L_0x0072:
        L_0x0073:
            r0.l = r7
            r0.m = r6
            r1 = r24
            com.google.android.gms.nearby.messages.internal.ClientAppContext r1 = com.google.android.gms.nearby.messages.internal.ClientAppContext.a(r1, r4, r3, r6)
            r0.n = r1
            r1 = r25
            r0.o = r1
            r1 = r26
            r0.p = r1
            r1 = r27
            r0.q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.SubscribeRequest.<init>(int, android.os.IBinder, com.google.android.gms.nearby.messages.Strategy, android.os.IBinder, com.google.android.gms.nearby.messages.MessageFilter, android.app.PendingIntent, int, java.lang.String, java.lang.String, byte[], boolean, android.os.IBinder, boolean, com.google.android.gms.nearby.messages.internal.ClientAppContext, boolean, int, int):void");
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        byte[] bArr = this.j;
        if (bArr != null) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(19);
            sb.append("<");
            sb.append(length);
            sb.append(" bytes>");
            str = sb.toString();
        } else {
            str = null;
        }
        String valueOf6 = String.valueOf(this.l);
        boolean z = this.m;
        String valueOf7 = String.valueOf(this.n);
        boolean z2 = this.o;
        String str2 = this.h;
        String str3 = this.i;
        boolean z3 = this.k;
        int i2 = this.q;
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(str).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        StringBuilder sb2 = new StringBuilder(length2 + 291 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("SubscribeRequest{messageListener=");
        sb2.append(valueOf);
        sb2.append(", strategy=");
        sb2.append(valueOf2);
        sb2.append(", callback=");
        sb2.append(valueOf3);
        sb2.append(", filter=");
        sb2.append(valueOf4);
        sb2.append(", pendingIntent=");
        sb2.append(valueOf5);
        sb2.append(", hint=");
        sb2.append(str);
        sb2.append(", subscribeCallback=");
        sb2.append(valueOf6);
        sb2.append(", useRealClientApiKey=");
        sb2.append(z);
        sb2.append(", clientAppContext=");
        sb2.append(valueOf7);
        sb2.append(", isDiscardPendingIntent=");
        sb2.append(z2);
        sb2.append(", zeroPartyPackageName=");
        sb2.append(str2);
        sb2.append(", realClientPackageName=");
        sb2.append(str3);
        sb2.append(", isIgnoreNearbyPermission=");
        sb2.append(z3);
        sb2.append(", callingContext=");
        sb2.append(i2);
        sb2.append("}");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        IBinder iBinder2;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        vcf vcf = this.b;
        IBinder iBinder3 = null;
        if (vcf != null) {
            iBinder = vcf.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 2, iBinder);
        ivx.a(parcel, 3, this.c, i2, false);
        vci vci = this.d;
        if (vci != null) {
            iBinder2 = vci.asBinder();
        } else {
            iBinder2 = null;
        }
        ivx.a(parcel, 4, iBinder2);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.b(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, this.k);
        vcq vcq = this.l;
        if (vcq != null) {
            iBinder3 = vcq.asBinder();
        }
        ivx.a(parcel, 12, iBinder3);
        ivx.a(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n, i2, false);
        ivx.a(parcel, 15, this.o);
        ivx.b(parcel, 16, this.p);
        ivx.b(parcel, 17, this.q);
        ivx.b(parcel, a2);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, IBinder iBinder3, boolean z, int i2) {
        this(iBinder, strategy, iBinder2, messageFilter, pendingIntent, (byte[]) null, iBinder3, z, 0, i2);
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i2, int i3) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, (String) null, (String) null, bArr, false, iBinder3, false, (ClientAppContext) null, z, i2, i3);
    }
}
