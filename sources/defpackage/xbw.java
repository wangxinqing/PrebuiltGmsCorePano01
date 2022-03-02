package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: xbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xbw {
    public static volatile boolean l = true;
    public final Object a = new Object();
    protected final Context b;
    protected final Bundle c;
    public final boolean d;
    public final yct e;
    public boolean f;
    public ConnectionResult g;
    public DataHolder h;
    public DataHolder i;
    public boolean j;
    public Cursor k;
    public final Collator m = Collator.getInstance();
    public final xbf n;
    private boolean o;

    protected xbw(Context context, xbf xbf, Bundle bundle) {
        this.b = context;
        this.n = xbf;
        this.c = bundle;
        this.d = !TextUtils.isEmpty((CharSequence) null);
        this.e = ycs.a;
    }

    protected static final void a(Cursor cursor, ycu ycu, ycg ycg, HashMap hashMap) {
        int i2 = -1;
        cursor.moveToPosition(-1);
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(6);
        long j2 = -1;
        while (cursor.moveToNext()) {
            long j3 = cursor.getLong(0);
            if (j3 != j2) {
                arrayList.clear();
                arrayList2.clear();
                i2 = cursor.getPosition();
                j2 = j3;
            }
            String string = cursor.getString(2);
            if ("vnd.android.cursor.item/email_v2".equals(string) || "vnd.android.cursor.item/phone_v2".equals(string)) {
                String string2 = cursor.getString(3);
                if (!TextUtils.isEmpty(string2) && !arrayList2.contains(string2)) {
                    arrayList2.add(string2);
                    String str = (String) hashMap.get(string2);
                    if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                        arrayList.add(str);
                        ycv ycv = ycu.a;
                        Integer valueOf = Integer.valueOf(i2);
                        iva.a((Object) str);
                        Object obj = ycv.a.get(str);
                        if (obj == null) {
                            ycv.a.put(str, valueOf);
                        } else if (obj instanceof ArrayList) {
                            ((ArrayList) obj).add(valueOf);
                        } else {
                            ArrayList arrayList3 = new ArrayList(4);
                            arrayList3.add(obj);
                            arrayList3.add(valueOf);
                            ycv.a.put(str, arrayList3);
                        }
                        iva.a((Object) valueOf);
                        Object obj2 = ycg.a.get(valueOf);
                        if (obj2 == null) {
                            ycg.a.put(valueOf, str);
                        } else if (obj2 instanceof String) {
                            ArrayList arrayList4 = new ArrayList(4);
                            arrayList4.add((String) obj2);
                            arrayList4.add(str);
                            ycg.a.put(valueOf, arrayList4);
                        } else {
                            ((ArrayList) obj2).add(str);
                        }
                    }
                }
            }
        }
    }

    protected static final void b(xbv xbv, HashMap hashMap) {
        xbv.c = -1;
        while (xbv.a()) {
            hashMap.put(xbv.a("value"), xbv.a("gaia_id"));
        }
    }

    /* access modifiers changed from: protected */
    public abstract xbp a(xbv xbv, xbv xbv2, Cursor cursor);

    /* access modifiers changed from: protected */
    public abstract Cursor b();

    public final void c() {
        synchronized (this.a) {
            iva.b(this.f);
            iva.b(this.j);
            DataHolder dataHolder = this.h;
            if (dataHolder != null) {
                dataHolder.close();
            }
            DataHolder dataHolder2 = this.i;
            if (dataHolder2 != null) {
                dataHolder2.close();
            }
            Cursor cursor = this.k;
            if (cursor != null) {
                cursor.close();
            }
            if (!this.o) {
                this.o = true;
                this.n.a(8, (xff) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        new defpackage.xbt(r3).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        android.util.Log.e("PeopleAggregator", "Unable to start thread", r0);
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r3.g.b() == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.f     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            boolean r1 = r3.j     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            com.google.android.gms.common.ConnectionResult r0 = r3.g
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0029
            xbt r0 = new xbt     // Catch:{ Exception -> 0x001d }
            r0.<init>(r3)     // Catch:{ Exception -> 0x001d }
            r0.start()     // Catch:{ Exception -> 0x001d }
            return
        L_0x001d:
            r0 = move-exception
            java.lang.String r1 = "PeopleAggregator"
            java.lang.String r2 = "Unable to start thread"
            android.util.Log.e(r1, r2, r0)
            r3.c()
            return
        L_0x0029:
            r3.c()
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbw.d():void");
    }

    protected static void a(xbv xbv, HashMap hashMap) {
        xbv.c = -1;
        while (xbv.a()) {
            String a2 = xbv.a("gaia_id");
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put(a2, Integer.valueOf(xbv.c));
            }
        }
    }

    public final void a() {
        try {
            new xbu(this).start();
        } catch (Exception e2) {
            Log.e("PeopleAggregator", "Unable to start thread", e2);
            a((Cursor) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Cursor cursor) {
        if (cursor == null) {
            this.e.a("contacts load failure");
        } else {
            this.e.a("contacts loaded");
        }
        if (cursor != null) {
            cursor.getCount();
        }
        synchronized (this.a) {
            this.j = true;
            this.k = cursor;
        }
        d();
    }
}
