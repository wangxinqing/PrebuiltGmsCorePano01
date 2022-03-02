package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: dzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzg extends AsyncTaskLoader {
    private static final String[] n = {"_id", "display_name"};
    public boolean a;
    private final Context b;
    private final String c;
    private final List d;
    private final boolean e;
    private final boolean f;
    private final icc g;
    private final dye h;
    private final dzb i;
    private boolean j = true;
    private eao k;
    private Cursor l;
    private Thread m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dzg(Context context, String str, LoaderSectionInfo loaderSectionInfo, dye dye, boolean z) {
        super(context);
        ibz ibz = new ibz(context.getApplicationContext());
        ibz.a(str);
        ibq ibq = wlt.a;
        wlr a2 = wls.a();
        a2.a = 80;
        ibz.a(ibq, (ibj) a2.a());
        icc b2 = ibz.b();
        this.b = context;
        this.c = str;
        this.d = loaderSectionInfo.l;
        this.e = "useCachedContacts".equals(loaderSectionInfo.d);
        this.f = "useLocalContactsOnly".equals(loaderSectionInfo.d);
        this.g = b2;
        this.h = dye;
        this.i = new dzb(loaderSectionInfo.b, true, z);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (this.j) {
            this.j = false;
            eao eao = new eao();
            this.k = eao;
            List list = this.d;
            if (list != null) {
                eao.a((Collection) list);
            }
            if (kf.a(getContext(), "android.permission.READ_CONTACTS") == 0) {
                this.l = getContext().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, n, "in_visible_group = 1", (String[]) null, "display_name ASC");
            }
            if (!this.f) {
                Thread thread = new Thread(new dzf(this, this.g, this.k, this.i, this.c, this.e, this.h));
                this.m = thread;
                thread.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r0.size() <= 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.HashMap b() {
        /*
            r13 = this;
            monitor-enter(r13)
            android.database.Cursor r0 = r13.l     // Catch:{ all -> 0x0083 }
            r1 = 0
            if (r0 == 0) goto L_0x0081
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            android.database.Cursor r2 = r13.l     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.isBeforeFirst()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x001e
            awhr r2 = defpackage.awhr.a     // Catch:{ all -> 0x0083 }
            awhv r2 = r2.a()     // Catch:{ all -> 0x0083 }
            long r2 = r2.n()     // Catch:{ all -> 0x0083 }
            goto L_0x0028
        L_0x001e:
            awhr r2 = defpackage.awhr.a     // Catch:{ all -> 0x0083 }
            awhv r2 = r2.a()     // Catch:{ all -> 0x0083 }
            long r2 = r2.o()     // Catch:{ all -> 0x0083 }
        L_0x0028:
            int r3 = (int) r2     // Catch:{ all -> 0x0083 }
        L_0x0029:
            int r2 = r0.size()     // Catch:{ all -> 0x0083 }
            if (r2 >= r3) goto L_0x0062
            android.database.Cursor r2 = r13.l     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.moveToNext()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0062
            android.database.Cursor r2 = r13.l     // Catch:{ all -> 0x0083 }
            r4 = 0
            java.lang.String r2 = r2.getString(r4)     // Catch:{ all -> 0x0083 }
            android.database.Cursor r4 = r13.l     // Catch:{ all -> 0x0083 }
            r5 = 1
            java.lang.String r7 = r4.getString(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Long r4 = java.lang.Long.decode(r2)     // Catch:{ all -> 0x0083 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0083 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0083 }
            r11.<init>()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.appinvite.model.ContactPerson r12 = new com.google.android.gms.appinvite.model.ContactPerson     // Catch:{ all -> 0x0083 }
            r8 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0083 }
            r10 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0083 }
            r0.put(r2, r12)     // Catch:{ all -> 0x0083 }
            goto L_0x0029
        L_0x0062:
            android.database.Cursor r2 = r13.l     // Catch:{ all -> 0x0083 }
            boolean r2 = r2.isAfterLast()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0078
            android.database.Cursor r2 = r13.l     // Catch:{ all -> 0x0083 }
            r2.close()     // Catch:{ all -> 0x0083 }
            r13.l = r1     // Catch:{ all -> 0x0083 }
            dye r2 = r13.h     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0078
            r2.h()     // Catch:{ all -> 0x0083 }
        L_0x0078:
            int r2 = r0.size()     // Catch:{ all -> 0x0083 }
            monitor-exit(r13)
            if (r2 <= 0) goto L_0x0080
            return r0
        L_0x0080:
            return r1
        L_0x0081:
            monitor-exit(r13)
            return r1
        L_0x0083:
            r0 = move-exception
            monitor-exit(r13)
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzg.b():java.util.HashMap");
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            Thread thread = this.m;
            if (thread != null) {
                if (!thread.isAlive()) {
                    this.m = null;
                }
            }
            boolean z = false;
            if (this.l == null && this.m == null) {
                z = true;
            }
            this.a = z;
        }
        if (isStarted()) {
            synchronized (this) {
                eao eao = this.k;
                getContext();
                eao.a();
                arrayList = new ArrayList(this.k.a);
            }
            super.deliverResult(arrayList);
            if (!this.a) {
                onContentChanged();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void deliverResult(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        c();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        synchronized (this) {
            Cursor cursor = this.l;
            if (cursor != null) {
                cursor.close();
                this.l = null;
            }
            Thread thread = this.m;
            if (thread != null) {
                thread.interrupt();
                this.m = null;
            }
            this.j = true;
        }
        this.a = false;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.a) {
            c();
        }
        synchronized (this) {
            if (takeContentChanged() || this.j) {
                forceLoad();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        this.g.g();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Thread thread;
        ContactPerson contactPerson;
        a();
        eao eao = new eao();
        HashMap b2 = b();
        if (b2 != null) {
            dzc dzc = new dzc(this.b, b2);
            HashMap hashMap = dzc.b;
            StringBuilder sb = new StringBuilder(hashMap.size() * 5);
            String str = "";
            for (String append : hashMap.keySet()) {
                sb.append(str);
                sb.append(append);
                str = ",";
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 16);
            sb3.append("contact_id in (");
            sb3.append(sb2);
            sb3.append(")");
            Cursor query = dzc.a.getContentResolver().query(dzc.e, dzc.f, sb3.toString(), (String[]) null, (String) null);
            int columnIndex = query.getColumnIndex("_id");
            StringBuilder sb4 = new StringBuilder(query.getCount() * 5);
            String str2 = "";
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                sb4.append(str2);
                sb4.append(string);
                str2 = ",";
            }
            query.close();
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 121);
            sb6.append("raw_contact_id in (");
            sb6.append(sb5);
            sb6.append(") AND (mimetype = 'vnd.android.cursor.item/email_v2' OR mimetype = 'vnd.android.cursor.item/phone_v2')");
            Cursor query2 = dzc.a.getContentResolver().query(dzc.c, dzc.d, sb6.toString(), (String[]) null, "is_super_primary DESC, is_primary DESC");
            int columnIndex2 = query2.getColumnIndex("data1");
            int columnIndex3 = query2.getColumnIndex("mimetype");
            int columnIndex4 = query2.getColumnIndex("contact_id");
            while (query2.moveToNext()) {
                String string2 = query2.getString(columnIndex4);
                if (!(string2 == null || string2.isEmpty() || (contactPerson = (ContactPerson) dzc.b.get(string2)) == null)) {
                    ArrayList arrayList = contactPerson.e;
                    String string3 = query2.getString(columnIndex2);
                    String string4 = query2.getString(columnIndex3);
                    if ("vnd.android.cursor.item/email_v2".equals(string4)) {
                        arrayList.add(new ContactPerson.ContactMethod(1, string3));
                    } else if ("vnd.android.cursor.item/phone_v2".equals(string4)) {
                        arrayList.add(new ContactPerson.ContactMethod(2, string3));
                    } else {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(string4).length() + 37 + string2.length());
                        sb7.append("Unexpected mimetype ");
                        sb7.append(string4);
                        sb7.append(" for Contact Id: ");
                        sb7.append(string2);
                        Log.w("Cp2ContactMethods", sb7.toString());
                    }
                }
            }
            query2.close();
            for (ContactPerson contactPerson2 : b2.values()) {
                if (contactPerson2 != null) {
                    this.i.a(contactPerson2.e);
                    if (contactPerson2.e.size() > 0) {
                        eao.a(contactPerson2);
                    }
                }
            }
            synchronized (this) {
                this.k.a((Collection) eao.a);
            }
        } else {
            synchronized (this) {
                thread = this.m;
            }
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e2) {
                }
            }
        }
        return eao.a;
    }
}
