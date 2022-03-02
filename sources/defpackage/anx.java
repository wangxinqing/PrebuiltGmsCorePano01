package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: anx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anx extends anw {
    private final Context a;

    public anx(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.net.Uri r6, int r7, int r8) {
        /*
            r5 = this;
            android.content.Context r0 = r5.a
            java.lang.String r1 = r0.getPackageName()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r2 = -1
            apa r0 = defpackage.apb.a((android.content.ContentResolver) r0, (android.net.Uri) r6)     // Catch:{ RemoteException -> 0x004f }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0043 }
            r3.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "slice_uri"
            r3.putParcelable(r4, r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "pkg"
            r3.putString(r6, r1)     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "pid"
            r3.putInt(r6, r7)     // Catch:{ all -> 0x0043 }
            java.lang.String r6 = "uid"
            r3.putInt(r6, r8)     // Catch:{ all -> 0x0043 }
            android.content.ContentProviderClient r6 = r0.a     // Catch:{ all -> 0x0043 }
            java.lang.String r7 = "check_perms"
            java.lang.String r8 = "supports_versioned_parcelable"
            android.os.Bundle r6 = r6.call(r7, r8, r3)     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x003f
            java.lang.String r7 = "result"
            int r6 = r6.getInt(r7)     // Catch:{ all -> 0x0043 }
            r0.close()     // Catch:{ RemoteException -> 0x004f }
            r2 = r6
            goto L_0x0057
        L_0x003f:
            r0.close()     // Catch:{ RemoteException -> 0x004f }
            goto L_0x0057
        L_0x0043:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r8 = move-exception
            defpackage.apev.a((java.lang.Throwable) r6, (java.lang.Throwable) r8)     // Catch:{ RemoteException -> 0x004f }
        L_0x004e:
            throw r7     // Catch:{ RemoteException -> 0x004f }
        L_0x004f:
            r6 = move-exception
            java.lang.String r7 = "SliceProviderCompat"
            java.lang.String r8 = "Unable to check slice permission"
            android.util.Log.e(r7, r8, r6)
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anx.a(android.net.Uri, int, int):int");
    }

    public final List a() {
        Context context = this.a;
        ArrayList arrayList = new ArrayList();
        for (String aoy : context.getSharedPreferences("slice_data_all_slice_files", 0).getStringSet("slice_data_all_slice_files", Collections.emptySet())) {
            aoy aoy2 = new aoy(context, aoy);
            ArrayList arrayList2 = new ArrayList();
            for (String next : aoy2.a().getAll().keySet()) {
                if (next.startsWith("pinned_")) {
                    Uri parse = Uri.parse(next.substring(7));
                    if (!aoy2.a(parse).isEmpty()) {
                        arrayList2.add(parse);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final Set a(Uri uri) {
        apa a2 = apb.a(this.a.getContentResolver(), uri);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            Bundle call = a2.a.call("get_specs", "supports_versioned_parcelable", bundle);
            if (call != null) {
                ob obVar = new ob();
                ArrayList<String> stringArrayList = call.getStringArrayList("specs");
                ArrayList<Integer> integerArrayList = call.getIntegerArrayList("revs");
                if (stringArrayList != null) {
                    if (integerArrayList != null) {
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            obVar.add(new SliceSpec(stringArrayList.get(i), integerArrayList.get(i).intValue()));
                        }
                    }
                }
                a2.close();
                return obVar;
            }
        } catch (RemoteException e) {
            Log.e("SliceProviderCompat", "Unable to get pinned specs", e);
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
        a2.close();
        return null;
    }
}
