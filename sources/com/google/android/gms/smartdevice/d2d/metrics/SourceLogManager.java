package com.google.android.gms.smartdevice.d2d.metrics;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceLogManager implements Parcelable {
    public static final Parcelable.Creator CREATOR = new acai();
    public static final iwd a = acqa.a("Setup", "UI", "SourceLogManager");
    public long b;
    public boolean c;
    public final Deque d;
    public hol e;
    public Context f;
    private int g;

    public SourceLogManager() {
        this.g = 1;
        this.d = new ArrayDeque();
        jiu jiu = jiu.a;
    }

    private final void a(anxb anxb) {
        aucd o = anwh.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anwh anwh = (anwh) o.b;
        anxb.getClass();
        anwh.c = anxb;
        int i = anwh.a | 2;
        anwh.a = i;
        long j = this.b;
        anwh.a = i | 1;
        anwh.b = j;
        if (!azlf.a.a().t()) {
            a.b("Clearcut logging is disabled", new Object[0]);
            return;
        }
        if (this.e == null) {
            Context context = this.f;
            if (context != null) {
                this.e = new hol(context, "SMART_SETUP", (String) null);
            } else {
                throw new IllegalStateException("Context is null");
            }
        }
        this.e.a(((anwh) o.i()).k()).b();
        a.a("UI event %s", anxb);
    }

    public final void b() {
        aucd o = anxb.l.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxb anxb = (anxb) o.b;
        anxb.c = 16;
        anxb.a |= 2;
        a(o);
    }

    public final void c() {
        aucd o = anxb.l.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxb anxb = (anxb) o.b;
        anxb.c = 18;
        anxb.a |= 2;
        a(o);
    }

    public final void d() {
        synchronized (this.d) {
            if (!this.c) {
                this.b = acpy.a();
                this.c = true;
            }
            while (!this.d.isEmpty()) {
                a((anxb) this.d.pop());
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final synchronized void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList;
        parcel.writeInt(this.g);
        parcel.writeLong(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        synchronized (this.d) {
            arrayList = new ArrayList(this.d.size());
            for (anxb k : this.d) {
                arrayList.add(k.k());
            }
        }
        parcel.writeList(arrayList);
    }

    public SourceLogManager(Context context) {
        this((byte[]) null);
        this.f = context;
    }

    public SourceLogManager(Parcel parcel) {
        this((byte[]) null);
        boolean z;
        this.g = parcel.readInt();
        this.b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, byte[].class.getClassLoader());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            try {
                this.d.add((anxb) aucj.a((aucj) anxb.l, bArr, aubs.c()));
            } catch (auda e2) {
                a.e("Failed to unparcel mEventQueue with %s", e2, new Object[0]);
            }
        }
    }

    public SourceLogManager(byte[] bArr) {
        this.g = 1;
        this.d = new ArrayDeque();
    }

    public final void a() {
        aucd o = anxb.l.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxb anxb = (anxb) o.b;
        anxb.c = 2;
        anxb.a = 2 | anxb.a;
        a(o);
    }

    public final void a(int i) {
        aucd o = anxb.l.o();
        if (i == -1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb = (anxb) o.b;
            anxb.c = 9;
            anxb.a |= 2;
        } else if (i == 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb2 = (anxb) o.b;
            anxb2.c = 11;
            anxb2.a |= 2;
        } else if (i == 2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb3 = (anxb) o.b;
            anxb3.c = 12;
            anxb3.a |= 2;
        } else if (i == 3) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb4 = (anxb) o.b;
            anxb4.c = 13;
            anxb4.a |= 2;
        } else if (i == 4) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb5 = (anxb) o.b;
            anxb5.c = 15;
            anxb5.a |= 2;
        } else if (i != 5) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb6 = (anxb) o.b;
            anxb6.c = 0;
            anxb6.a = 2 | anxb6.a;
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown setup result: ");
            sb.append(i);
            iwd.e(sb.toString(), new Object[0]);
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            anxb anxb7 = (anxb) o.b;
            anxb7.c = 19;
            anxb7.a |= 2;
        }
        a(o);
        d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        r2.c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r2.a = r8 | 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r0.c != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r0.c();
        r0.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r6 = (defpackage.anxb) r0.b;
        r6.c = 3;
        r6.a |= 2;
        r7 = (defpackage.anwr) r1.i();
        r7.getClass();
        r6.f = r7;
        r6.a |= 64;
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6, byte r7, boolean r8, int r9) {
        /*
            r5 = this;
            anxb r0 = defpackage.anxb.l
            aucd r0 = r0.o()
            anwr r1 = defpackage.anwr.f
            aucd r1 = r1.o()
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L_0x0016
            r1.c()
            r1.c = r3
        L_0x0016:
            aucj r2 = r1.b
            anwr r2 = (defpackage.anwr) r2
            int r4 = r2.a
            r4 = r4 | 1
            r2.a = r4
            r2.b = r6
            r6 = 4
            r4 = r4 | r6
            r2.a = r4
            r2.d = r8
            int r8 = r9 + -1
            if (r9 == 0) goto L_0x009b
            r2.e = r8
            r8 = r4 | 8
            r2.a = r8
            r9 = 3
            r4 = 2
            switch(r7) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0063;
                case 2: goto L_0x0061;
                case 3: goto L_0x005e;
                case 4: goto L_0x005d;
                case 5: goto L_0x005a;
                case 6: goto L_0x0058;
                default: goto L_0x0037;
            }
        L_0x0037:
            r2.c = r3
            r6 = r8 | 2
            r2.a = r6
            iwd r6 = a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r2 = 35
            r8.<init>(r2)
            java.lang.String r2 = "Unknown discovery device type: "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r6.e(r7, r8)
            goto L_0x0071
        L_0x0058:
            r6 = 7
            goto L_0x0064
        L_0x005a:
            r2.c = r9
            goto L_0x0066
        L_0x005d:
            goto L_0x0064
        L_0x005e:
            r2.c = r4
            goto L_0x0066
        L_0x0061:
            r6 = 6
            goto L_0x0064
        L_0x0063:
            r6 = 5
        L_0x0064:
            r2.c = r6
        L_0x0066:
            r6 = r8 | 2
            r2.a = r6
            goto L_0x0071
        L_0x006b:
            r2.c = r3
            r6 = r8 | 2
            r2.a = r6
        L_0x0071:
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r0.c()
            r0.c = r3
        L_0x007b:
            aucj r6 = r0.b
            anxb r6 = (defpackage.anxb) r6
            r6.c = r9
            int r7 = r6.a
            r7 = r7 | r4
            r6.a = r7
            aucj r7 = r1.i()
            anwr r7 = (defpackage.anwr) r7
            r7.getClass()
            r6.f = r7
            int r7 = r6.a
            r7 = r7 | 64
            r6.a = r7
            r5.a((defpackage.aucd) r0)
            return
        L_0x009b:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager.a(int, byte, boolean, int):void");
    }

    public final void a(int i, int i2) {
        aucd o = anxb.l.o();
        aucd o2 = anxa.d.o();
        int a2 = aceh.a(i);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anxa anxa = (anxa) o2.b;
        anxa.b = a2 - 1;
        anxa.a |= 1;
        if (a2 == 1) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown trigger type: ");
            sb.append(i);
            iwd.e(sb.toString(), new Object[0]);
        }
        if (i2 == -1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa2 = (anxa) o2.b;
            anxa2.c = 3;
            anxa2.a |= 2;
        } else if (i2 == 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa3 = (anxa) o2.b;
            anxa3.c = 1;
            anxa3.a |= 2;
        } else if (i2 == 1) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa4 = (anxa) o2.b;
            anxa4.c = 2;
            anxa4.a |= 2;
        } else if (i2 == 6) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa5 = (anxa) o2.b;
            anxa5.c = 4;
            anxa5.a |= 2;
        } else if (i2 == 7) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa6 = (anxa) o2.b;
            anxa6.c = 5;
            anxa6.a |= 2;
        } else if (i2 == 9) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa7 = (anxa) o2.b;
            anxa7.c = 6;
            anxa7.a |= 2;
        } else if (i2 != 17) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa8 = (anxa) o2.b;
            anxa8.c = 8;
            anxa8.a |= 2;
            iwd iwd2 = a;
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unknown connection type: ");
            sb2.append(i2);
            iwd2.d(sb2.toString(), new Object[0]);
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anxa anxa9 = (anxa) o2.b;
            anxa9.c = 7;
            anxa9.a |= 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxb anxb = (anxb) o.b;
        anxb.c = 1;
        anxb.a |= 2;
        anxa anxa10 = (anxa) o2.i();
        anxa10.getClass();
        anxb.e = anxa10;
        anxb.a |= 32;
        a(o);
    }

    public final void a(acni acni) {
        aucd o = anxb.l.o();
        aucd o2 = anwv.g.o();
        int i = acni.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anwv anwv = (anwv) o2.b;
        boolean z = true;
        int i2 = anwv.a | 1;
        anwv.a = i2;
        anwv.b = i;
        int i3 = acni.c;
        int i4 = i2 | 4;
        anwv.a = i4;
        anwv.d = i3;
        int i5 = acni.d;
        int i6 = i4 | 8;
        anwv.a = i6;
        anwv.e = i5;
        if (acni.a == null) {
            z = false;
        }
        int i7 = i6 | 2;
        anwv.a = i7;
        anwv.c = z;
        boolean z2 = acni.e;
        anwv.a = i7 | 16;
        anwv.f = z2;
        anwv anwv2 = (anwv) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anxb anxb = (anxb) o.b;
        anxb.c = 5;
        int i8 = anxb.a | 2;
        anxb.a = i8;
        anwv2.getClass();
        anxb.h = anwv2;
        anxb.a = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(o);
    }

    public final void a(aucd aucd) {
        long currentTimeMillis = System.currentTimeMillis();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anxb anxb = (anxb) aucd.b;
        anxb anxb2 = anxb.l;
        anxb.a |= 8;
        anxb.d = currentTimeMillis;
        synchronized (this.d) {
            int i = this.g;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anxb anxb3 = (anxb) aucd.b;
            anxb3.a |= 1;
            anxb3.b = i;
            this.g++;
            if (!this.c) {
                this.d.add((anxb) aucd.i());
            } else {
                a((anxb) aucd.i());
            }
        }
    }
}
