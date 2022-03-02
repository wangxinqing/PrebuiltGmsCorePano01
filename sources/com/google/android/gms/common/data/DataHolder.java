package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new ilo();
    private static final ilm k = new ill(new String[0]);
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    int[] g;
    public int h;
    boolean i;
    public boolean j;

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = i2;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i3;
        this.f = bundle;
    }

    public static DataHolder a(int i2, Bundle bundle) {
        return new DataHolder(k, i2, bundle);
    }

    public static DataHolder b(int i2) {
        return a(i2, (Bundle) null);
    }

    public final String c(String str, int i2, int i3) {
        a(str, i2);
        return this.d[i3].getString(i2, this.c.getInt(str));
    }

    public final void close() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.d;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    public final boolean d(String str, int i2, int i3) {
        a(str, i2);
        return Long.valueOf(this.d[i3].getLong(i2, this.c.getInt(str))).longValue() == 1;
    }

    public final byte[] e(String str, int i2, int i3) {
        a(str, i2);
        return this.d[i3].getBlob(i2, this.c.getInt(str));
    }

    public final boolean f(String str, int i2, int i3) {
        a(str, i2);
        return this.d[i3].isNull(i2, this.c.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !b()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataHolder(android.database.Cursor r7, android.os.Bundle r8) {
        /*
            r6 = this;
            jbo r0 = new jbo
            r0.<init>(r7)
            java.lang.String[] r7 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch:{ all -> 0x0077 }
            android.database.CursorWindow r3 = r0.getWindow()     // Catch:{ all -> 0x0077 }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            int r5 = r3.getStartPosition()     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x002d
            r3.acquireReference()     // Catch:{ all -> 0x0077 }
            r0.a()     // Catch:{ all -> 0x0077 }
            r1.add(r3)     // Catch:{ all -> 0x0077 }
            int r3 = r3.getNumRows()     // Catch:{ all -> 0x0077 }
            goto L_0x0030
        L_0x002d:
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 < r2) goto L_0x0033
            goto L_0x0064
        L_0x0033:
            boolean r5 = r0.moveToPosition(r3)     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0064
            android.database.CursorWindow r5 = r0.getWindow()     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x004b
            android.database.CursorWindow r5 = new android.database.CursorWindow     // Catch:{ all -> 0x0077 }
            r5.<init>(r4)     // Catch:{ all -> 0x0077 }
            r5.setStartPosition(r3)     // Catch:{ all -> 0x0077 }
            r0.fillWindow(r3, r5)     // Catch:{ all -> 0x0077 }
            goto L_0x0051
        L_0x004b:
            r5.acquireReference()     // Catch:{ all -> 0x0077 }
            r0.a()     // Catch:{ all -> 0x0077 }
        L_0x0051:
            int r3 = r5.getNumRows()     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0064
            r1.add(r5)     // Catch:{ all -> 0x0077 }
            int r3 = r5.getStartPosition()     // Catch:{ all -> 0x0077 }
            int r5 = r5.getNumRows()     // Catch:{ all -> 0x0077 }
            int r3 = r3 + r5
            goto L_0x0030
        L_0x0064:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r6.<init>(r7, r0, r4, r8)
            return
        L_0x0077:
            r7 = move-exception
            r0.close()
            goto L_0x007d
        L_0x007c:
            throw r7
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, android.os.Bundle):void");
    }

    public static ilm a(String[] strArr) {
        return new ilm(strArr);
    }

    public final int b(String str, int i2, int i3) {
        a(str, i2);
        return this.d[i3].getInt(i2, this.c.getInt(str));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, (Parcelable[]) this.d, i2);
        ivx.b(parcel, 3, this.e);
        ivx.a(parcel, 4, this.f, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public static CursorWindow[] a(ilm ilm) {
        if (ilm.a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = ilm.b;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(ilm.a.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    sb.toString();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(ilm.a.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i2);
                int i3 = 0;
                boolean z2 = true;
                while (true) {
                    String[] strArr = ilm.a;
                    if (i3 < strArr.length) {
                        if (!z2) {
                            break;
                        }
                        String str = strArr[i3];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i2, i3);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(!((Boolean) obj).booleanValue() ? 0 : 1, i2, i3);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                        } else {
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(valueOf);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        i3++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    sb3.toString();
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(ilm.a.length);
                    arrayList2.add(cursorWindow);
                    i2--;
                    z = true;
                    i2++;
                } else {
                    throw new iln("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e2) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList2.get(i4)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    public DataHolder(ilm ilm, int i2, Bundle bundle) {
        this(ilm.a, a(ilm), i2, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.i = false;
        this.j = true;
        this.a = 1;
        this.b = (String[]) iva.a((Object) strArr);
        this.d = (CursorWindow[]) iva.a((Object) cursorWindowArr);
        this.e = i2;
        this.f = bundle;
        a();
    }

    public final int a(int i2) {
        boolean z;
        int length;
        int i3 = 0;
        if (i2 < 0 || i2 >= this.h) {
            z = false;
        } else {
            z = true;
        }
        iva.a(z);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i3 < length) {
                if (i2 < iArr[i3]) {
                    i3--;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        return i3 == length ? i3 - 1 : i3;
    }

    public final long a(String str, int i2, int i3) {
        a(str, i2);
        return this.d[i3].getLong(i2, this.c.getInt(str));
    }

    public final void a() {
        this.c = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i3 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i3], i3);
            i3++;
        }
        this.g = new int[this.d.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i2 < cursorWindowArr.length) {
                this.g[i2] = i4;
                i4 += this.d[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.h = i4;
                return;
            }
        }
    }

    public final void a(String str, int i2) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No such column: ") : "No such column: ".concat(valueOf));
        } else if (b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.h) {
            throw new CursorIndexOutOfBoundsException(i2, this.h);
        }
    }

    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
