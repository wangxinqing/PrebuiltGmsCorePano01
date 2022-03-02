package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: nkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nkt extends Binder {
    final njk a;
    private volatile Binder b;
    private final nig c;
    private final int d;
    private final njj e;

    public nkt(Context context, Binder binder) {
        this(binder, context, (nig) null, -1, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r2 = ((android.os.Binder) r2).getInterfaceDescriptor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.os.IBinder r2) {
        /*
            boolean r0 = r2 instanceof android.os.Binder
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2 instanceof defpackage.nkt
            if (r0 != 0) goto L_0x001b
            android.os.Binder r2 = (android.os.Binder) r2
            java.lang.String r2 = r2.getInterfaceDescriptor()
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = "android.service.notification.IConditionProvider"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001b
            r2 = 1
            return r2
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkt.a(android.os.IBinder):boolean");
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i > 16777215) {
            return this.b.transact(i, parcel, parcel2, i2);
        }
        nig nig = Binder.getCallingUid() == this.d ? this.c : null;
        if (this.e != null) {
            int dataPosition = parcel.dataPosition();
            try {
                int dataSize = parcel.dataSize() - 8;
                if (dataSize > 0) {
                    parcel.setDataPosition(dataSize);
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != -1205835348) {
                        throw new nji("bad magic suffix");
                    } else if (readInt < 0 || readInt >= dataSize) {
                        StringBuilder sb = new StringBuilder(58);
                        sb.append("length out of range: ");
                        sb.append(readInt);
                        sb.append(" should be [0,");
                        sb.append(dataSize);
                        sb.append(")");
                        throw new nji(sb.toString());
                    } else {
                        parcel.setDataPosition(dataSize - readInt);
                        str = parcel.readString();
                        parcel.setDataPosition(dataPosition);
                        nig = njm.a(str, nig);
                    }
                } else {
                    throw new nji("parcel too small");
                }
            } catch (nji e2) {
                Log.e("BinderPropagation", e2.getMessage(), e2);
                str = "binderprop_error";
            } catch (Throwable th) {
                parcel.setDataPosition(dataPosition);
                throw th;
            }
        }
        amky a2 = this.a.a(i, amta.a((Object) nig));
        try {
            if ((this.b instanceof niz) || (this.b instanceof jbh)) {
                njx c2 = nku.c();
                if (c2 != null) {
                    c2.c = true;
                }
            }
            boolean transact = this.b.transact(i, parcel, parcel2, i2);
            if (a2 != null) {
                a2.close();
            }
            return transact;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    public nkt(Binder binder, Context context, nig nig, int i, int i2) {
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        this.b = binder;
        this.c = nig;
        this.d = i;
        this.e = i2 != 0 ? njj.a() : null;
        attachInterface(binder.queryLocalInterface(interfaceDescriptor), interfaceDescriptor);
        this.a = new njk(context, binder);
    }
}
