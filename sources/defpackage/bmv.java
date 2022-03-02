package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: bmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bmv extends ContentProvider {
    public static final UriMatcher a;
    public static final Comparator c = bmt.a;
    public Context b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        uriMatcher.addURI("*", "features", 1);
    }

    /* access modifiers changed from: protected */
    public final boz a() {
        bkv a2 = bkv.a(this.b);
        try {
            return a2.f();
        } catch (InvalidConfigException e) {
            b();
            try {
                return a2.f();
            } catch (InvalidConfigException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Module config not available yet: ");
                sb.append(valueOf);
                Log.w("ModuleProvider", sb.toString());
                return null;
            }
        }
    }

    public abstract void b();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r21, java.lang.String r22, android.os.Bundle r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            int r3 = r21.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 3
            switch(r3) {
                case -1102730960: goto L_0x0030;
                case -399917498: goto L_0x0026;
                case -135988305: goto L_0x001c;
                case 1556259298: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x003a
        L_0x0012:
            java.lang.String r3 = "featureFetchCall"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x001c:
            java.lang.String r3 = "serviceIntentCall"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 3
            goto L_0x003b
        L_0x0026:
            java.lang.String r3 = "feature_request"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 2
            goto L_0x003b
        L_0x0030:
            java.lang.String r3 = "featureCheckCall"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = -1
        L_0x003b:
            java.lang.String r3 = "An error occurred while trying to load the container features. All client api feature requests will fail."
            java.lang.String r8 = "featuresResult"
            java.lang.String r9 = "ModuleProvider"
            r10 = 0
            if (r0 == 0) goto L_0x0176
            if (r0 == r6) goto L_0x011e
            if (r0 == r5) goto L_0x009e
            if (r0 == r7) goto L_0x004b
            return r10
        L_0x004b:
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "serviceActionBundleKey"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0055
        L_0x0054:
            r0 = r10
        L_0x0055:
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "Missing action in extras: serviceIntentCall"
            android.util.Log.e(r9, r0)
            goto L_0x009d
        L_0x005d:
            boz r2 = r20.a()
            if (r2 == 0) goto L_0x009d
            apxg r2 = r2.f()
            java.lang.String r3 = r2.F()
            java.lang.String r4 = defpackage.brt.a((java.lang.String) r3, (java.lang.String) r0)
            apxg r2 = r2.e((java.lang.String) r4)
            if (r2 == 0) goto L_0x009d
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            android.content.Context r0 = r1.b
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r0 = r4.setPackage(r0)
            android.content.Context r4 = r1.b
            java.lang.String r2 = r2.U()
            java.lang.String r2 = defpackage.brt.b((java.lang.String) r3, (java.lang.String) r2)
            android.content.Intent r0 = r0.setClassName(r4, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "serviceResponseIntentKey"
            r2.putParcelable(r3, r0)
            return r2
        L_0x009d:
            return r10
        L_0x009e:
            int r0 = android.os.Binder.getCallingUid()
            int r3 = android.os.Process.myUid()
            if (r0 == r3) goto L_0x00af
            java.lang.String r0 = "requesting feature from outside of GmsCore is not supported"
            android.util.Log.e(r9, r0)
            goto L_0x011d
        L_0x00af:
            if (r2 == 0) goto L_0x011c
            java.lang.String r0 = "requester"
            java.lang.String r12 = r2.getString(r0)
            if (r12 == 0) goto L_0x011c
            java.lang.String r0 = "unrequested"
            java.util.ArrayList r0 = r2.getStringArrayList(r0)
            if (r0 != 0) goto L_0x00c7
            java.util.List r0 = java.util.Collections.emptyList()
            r14 = r0
            goto L_0x00c8
        L_0x00c7:
            r14 = r0
        L_0x00c8:
            java.lang.String r0 = "forceUnrequest"
            boolean r15 = r2.getBoolean(r0)
            java.lang.String r0 = "urgent"
            boolean r16 = r2.getBoolean(r0)
            java.lang.String r0 = "listener"
            boj r17 = defpackage.bpx.a((android.os.Bundle) r2, (java.lang.String) r0)
            java.lang.String r0 = "sessionId"
            java.lang.String r18 = r2.getString(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r3 = "requested"
            byte[] r2 = r2.getByteArray(r3)
            if (r2 == 0) goto L_0x0104
            aubs r0 = defpackage.aubs.b()     // Catch:{ auda -> 0x00fd }
            bod r3 = defpackage.bod.b     // Catch:{ auda -> 0x00fd }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r2, (defpackage.aubs) r0)     // Catch:{ auda -> 0x00fd }
            bod r0 = (defpackage.bod) r0     // Catch:{ auda -> 0x00fd }
            aucx r0 = r0.a     // Catch:{ auda -> 0x00fd }
            r13 = r0
            goto L_0x0105
        L_0x00fd:
            r0 = move-exception
            java.lang.String r0 = "Malformed requested features"
            android.util.Log.e(r9, r0)
            goto L_0x011d
        L_0x0104:
            r13 = r0
        L_0x0105:
            android.content.Context r0 = r1.b
            blg r11 = defpackage.blg.a((android.content.Context) r0)
            r19 = 0
            boolean r0 = r11.a(r12, r13, r14, r15, r16, r17, r18, r19)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r2 = "result"
            r10.putBoolean(r2, r0)
            goto L_0x011d
        L_0x011c:
        L_0x011d:
            return r10
        L_0x011e:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r2 != 0) goto L_0x012e
            java.lang.String r2 = "Missing extras bundle"
            android.util.Log.e(r9, r2)
            r0.putInt(r8, r7)
            goto L_0x0175
        L_0x012e:
            java.lang.String r5 = "featureNamesBundleKey"
            java.lang.String[] r2 = r2.getStringArray(r5)
            if (r2 != 0) goto L_0x0138
            goto L_0x016c
        L_0x0138:
            int r5 = r2.length
            if (r5 == 0) goto L_0x016c
            boz r5 = r20.a()
            if (r5 != 0) goto L_0x0148
            android.util.Log.e(r9, r3)
            r0.putInt(r8, r7)
            goto L_0x0175
        L_0x0148:
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = defpackage.bpr.a((defpackage.boz) r5, (java.util.Collection) r2)
            boe r3 = defpackage.boe.b
            aucd r3 = r3.o()
            r3.j((java.lang.Iterable) r2)
            aucj r2 = r3.i()
            boe r2 = (defpackage.boe) r2
            byte[] r2 = r2.k()
            java.lang.String r3 = "featuresResponseListKey"
            r0.putByteArray(r3, r2)
            r0.putInt(r8, r4)
            goto L_0x0175
        L_0x016c:
            java.lang.String r2 = "Missing feature names to fetch for key: featureNamesBundleKey"
            android.util.Log.e(r9, r2)
            r0.putInt(r8, r7)
        L_0x0175:
            return r0
        L_0x0176:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r2 == 0) goto L_0x0184
            java.lang.String r4 = "featuresBundleKey"
            byte[] r10 = r2.getByteArray(r4)
            goto L_0x0185
        L_0x0184:
        L_0x0185:
            if (r10 != 0) goto L_0x0190
            java.lang.String r2 = "Missing extras key: featureCheckCall"
            android.util.Log.e(r9, r2)
            r0.putInt(r8, r7)
            goto L_0x01aa
        L_0x0190:
            boz r2 = r20.a()
            if (r2 != 0) goto L_0x019d
            android.util.Log.e(r9, r3)
            r0.putInt(r8, r7)
            goto L_0x01aa
        L_0x019d:
            int r2 = defpackage.bpr.a((defpackage.boz) r2, (byte[]) r10)
            if (r2 == r5) goto L_0x01a5
            r6 = r2
            goto L_0x01a6
        L_0x01a5:
        L_0x01a6:
            r0.putInt(r8, r6)
        L_0x01aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmv.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        boz boz;
        String str2;
        bmv bmv = this;
        PrintWriter printWriter2 = printWriter;
        bkv a2 = bkv.a(bmv.b);
        try {
            boz f = a2.f();
            bpw c2 = a2.c(f);
            printWriter2.println("Module Sets:");
            int size = c2.size();
            int i = 0;
            while (true) {
                str = "  ";
                if (i >= size) {
                    break;
                }
                ansk ansk = (ansk) c2.get(i);
                StringBuilder sb = new StringBuilder(str);
                sb.append("Module Set ID: ");
                sb.append(ansk.b);
                sb.append(", Module Set Version: ");
                sb.append(ansk.e);
                if ((ansk.d & 128) != 0) {
                    sb.append(" (placebo)");
                }
                printWriter2.println(sb);
                if (ansk.f.size() > 0) {
                    StringBuilder sb2 = new StringBuilder("      ");
                    sb2.append("Enabled features: ");
                    for (int i2 = 0; i2 < ansk.f.size(); i2++) {
                        if (i2 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append((String) ansk.f.get(i2));
                    }
                    printWriter2.println(sb2);
                }
                i++;
            }
            printWriter.println();
            int d = f.d();
            if (d > 0) {
                printWriter2.println("Blacklisted Modules:");
                for (int i3 = 0; i3 < d; i3++) {
                    String valueOf = String.valueOf(f.c(i3));
                    printWriter2.println(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
                printWriter.println();
            }
            printWriter2.println("Modules:");
            int c3 = f.c();
            ArrayList arrayList = new ArrayList(c3);
            int i4 = 0;
            while (i4 < c3) {
                arrayList.add(f.b(i4));
                i4++;
                bmv = this;
            }
            Collections.sort(arrayList, c);
            String valueOf2 = String.valueOf(new File(blu.a(bmv.b).b, "m").getAbsolutePath());
            String valueOf3 = String.valueOf(File.separator);
            String str3 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            int b2 = f.b();
            boy boy = new boy();
            int i5 = 0;
            int i6 = 0;
            while (i5 < b2) {
                f.a(boy, i5);
                StringBuilder sb3 = new StringBuilder(str);
                sb3.append(boy.f());
                sb3.append(" [");
                sb3.append(boy.h());
                sb3.append("] [");
                int i7 = b2;
                String g = boy.g();
                if (!TextUtils.isEmpty(g)) {
                    sb3.append(g);
                    sb3.append("] [");
                }
                int a3 = bnj.a(boy.a());
                int i8 = a3 - 1;
                if (a3 != 0) {
                    int i9 = i6;
                    if (i8 != 1) {
                        str2 = str;
                        if (i8 != 2) {
                            boz = f;
                            if (i8 == 3) {
                                int a4 = bpc.a(boy.i());
                                int i10 = a4 - 1;
                                if (a4 != 0) {
                                    if (i10 == 1) {
                                        sb3.append("Container");
                                    } else if (i10 == 2) {
                                        sb3.append("Download");
                                    } else if (i10 == 3) {
                                        sb3.append("Installed");
                                    } else if (i10 != 4) {
                                        sb3.append("???");
                                    } else {
                                        sb3.append("System");
                                    }
                                    String b3 = boy.b();
                                    if (b3.startsWith(str3)) {
                                        b3 = b3.substring(str3.length());
                                    }
                                    sb3.append(":");
                                    sb3.append(b3);
                                } else {
                                    throw null;
                                }
                            } else if (i8 != 4) {
                                sb3.append("???");
                            } else {
                                sb3.append("Split");
                            }
                        } else {
                            boz = f;
                            sb3.append("Installed");
                        }
                    } else {
                        boz = f;
                        str2 = str;
                        sb3.append("Container");
                    }
                    sb3.append("]");
                    int a5 = bnj.a(boy.a());
                    if (a5 == 4 || a5 == 5) {
                        sb3.append(" [");
                        sb3.append(boy.n());
                        if (boy.o() != null) {
                            sb3.append(":");
                            sb3.append(boy.o());
                        }
                        if (boy.p() != null) {
                            sb3.append(":");
                            sb3.append(boy.p());
                        }
                        sb3.append("]");
                    }
                    printWriter2.println(sb3);
                    int size2 = arrayList.size();
                    i6 = i9;
                    boolean z = false;
                    while (i6 < size2 && ((bpa) arrayList.get(i6)).S() == i5) {
                        bpa bpa = (bpa) arrayList.get(i6);
                        StringBuilder sb4 = new StringBuilder("      ");
                        sb4.append(bpa.b());
                        sb4.append(" [v");
                        sb4.append(bpa.e());
                        sb4.append("]");
                        printWriter2.println(sb4);
                        i6++;
                        z = true;
                    }
                    if (!z) {
                        printWriter2.println("      No modules accepted");
                    }
                    i5++;
                    b2 = i7;
                    str = str2;
                    f = boz;
                } else {
                    throw null;
                }
            }
            boz boz2 = f;
            String str4 = str;
            printWriter.println();
            printWriter2.println("Features:");
            int e = boz2.e();
            apxg apxg = new apxg();
            int i11 = 0;
            while (i11 < e) {
                boz boz3 = boz2;
                boz3.a(apxg, i11);
                StringBuilder sb5 = new StringBuilder();
                String str5 = str4;
                sb5.append(str5);
                sb5.append(apxg.Q());
                sb5.append(" [v");
                sb5.append(apxg.s());
                sb5.append("]");
                if (apxg.t()) {
                    sb5.append(" [optional]");
                }
                printWriter2.println(sb5.toString());
                i11++;
                boz2 = boz3;
                str4 = str5;
            }
            printWriter.println();
        } catch (InvalidConfigException e2) {
            String valueOf4 = String.valueOf(e2);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
            sb6.append("Unable to retrieve config: ");
            sb6.append(valueOf4);
            printWriter2.println(sb6.toString());
        }
    }

    public String getType(Uri uri) {
        if (a.match(uri) != 1) {
            return null;
        }
        return "vnd.android.cursor.item/features";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        amtf.a((Object) context);
        this.b = context;
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (a.match(uri) != 1) {
            int i = Build.VERSION.SDK_INT;
            String callingPackage = getCallingPackage();
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(callingPackage).length() + 23 + String.valueOf(valueOf).length());
            sb.append("Unhandled query from ");
            sb.append(callingPackage);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("ModuleProvider", sb.toString());
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(bmu.a);
        boz a2 = a();
        if (a2 != null) {
            int e = a2.e();
            apxg apxg = new apxg();
            for (int i2 = 0; i2 < e; i2++) {
                a2.a(apxg, i2);
                matrixCursor.addRow(new Object[]{apxg.Q(), Long.valueOf(apxg.s())});
            }
        }
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
