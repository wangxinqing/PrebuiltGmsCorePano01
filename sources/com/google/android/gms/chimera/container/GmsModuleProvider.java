package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsModuleProvider extends bmv {
    public static final UriMatcher d;
    public Context e;
    private jlm f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI("*", "api/*", 1);
        d.addURI("*", "api_force_staging/*", 2);
    }

    public final void b() {
        hff.a().b();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        String str2;
        String str3;
        boz boz;
        String str4;
        GmsModuleProvider gmsModuleProvider = this;
        PrintWriter printWriter2 = printWriter;
        bkv a = bkv.a(gmsModuleProvider.b);
        try {
            boz f2 = a.f();
            bpw c = a.c(f2);
            printWriter2.println("Module Sets:");
            int size = c.size();
            int i = 0;
            while (true) {
                str3 = "  ";
                if (i >= size) {
                    break;
                }
                ansk ansk = (ansk) c.get(i);
                StringBuilder sb = new StringBuilder(str3);
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
            int d2 = f2.d();
            if (d2 > 0) {
                printWriter2.println("Blacklisted Modules:");
                for (int i3 = 0; i3 < d2; i3++) {
                    String valueOf = String.valueOf(f2.c(i3));
                    printWriter2.println(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
                }
                printWriter.println();
            }
            printWriter2.println("Modules:");
            int c2 = f2.c();
            ArrayList arrayList = new ArrayList(c2);
            int i4 = 0;
            while (i4 < c2) {
                String str5 = str3;
                arrayList.add(f2.b(i4));
                i4++;
                gmsModuleProvider = this;
            }
            Collections.sort(arrayList, bmv.c);
            String valueOf2 = String.valueOf(new File(blu.a(gmsModuleProvider.b).b, "m").getAbsolutePath());
            String valueOf3 = String.valueOf(File.separator);
            String str6 = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            int b = f2.b();
            boy boy = new boy();
            int i5 = 0;
            int i6 = 0;
            while (i5 < b) {
                f2.a(boy, i5);
                StringBuilder sb3 = new StringBuilder(str3);
                sb3.append(boy.f());
                sb3.append(" [");
                int i7 = b;
                sb3.append(boy.h());
                sb3.append("] [");
                int i8 = i6;
                String g = boy.g();
                if (!TextUtils.isEmpty(g)) {
                    sb3.append(g);
                    sb3.append("] [");
                }
                int a2 = bnj.a(boy.a());
                int i9 = a2 - 1;
                if (a2 != 0) {
                    if (i9 != 1) {
                        str4 = str3;
                        if (i9 != 2) {
                            boz = f2;
                            if (i9 == 3) {
                                int a3 = bpc.a(boy.i());
                                int i10 = a3 - 1;
                                if (a3 != 0) {
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
                                    String b2 = boy.b();
                                    if (b2.startsWith(str6)) {
                                        b2 = b2.substring(str6.length());
                                    }
                                    sb3.append(":");
                                    sb3.append(b2);
                                } else {
                                    throw null;
                                }
                            } else if (i9 != 4) {
                                sb3.append("???");
                            } else {
                                sb3.append("Split");
                            }
                        } else {
                            boz = f2;
                            sb3.append("Installed");
                        }
                    } else {
                        boz = f2;
                        str4 = str3;
                        sb3.append("Container");
                    }
                    sb3.append("]");
                    int a4 = bnj.a(boy.a());
                    if (a4 == 4 || a4 == 5) {
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
                    i6 = i8;
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
                    b = i7;
                    str3 = str4;
                    f2 = boz;
                } else {
                    throw null;
                }
            }
            boz boz2 = f2;
            String str7 = str3;
            printWriter.println();
            printWriter2.println("Features:");
            int e2 = boz2.e();
            apxg apxg = new apxg();
            int i11 = 0;
            while (i11 < e2) {
                boz boz3 = boz2;
                boz3.a(apxg, i11);
                StringBuilder sb5 = new StringBuilder();
                String str8 = str7;
                sb5.append(str8);
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
                str7 = str8;
            }
            printWriter.println();
        } catch (InvalidConfigException e3) {
            String valueOf4 = String.valueOf(e3);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
            sb6.append("Unable to retrieve config: ");
            sb6.append(valueOf4);
            printWriter2.println(sb6.toString());
        }
        printWriter2.println("\nModule Set Journal Entries:\n");
        hef hef = new hef(aekv.d(this.e.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 4), true);
        hhl c3 = hef.c();
        Set b3 = hef.b();
        aucx aucx = c3.a;
        int size3 = aucx.size();
        for (int i12 = 0; i12 < size3; i12++) {
            hhp hhp = (hhp) aucx.get(i12);
            String str9 = hhp.b;
            long j = hhp.c;
            String str10 = "";
            String str11 = !b3.contains(str9) ? str10 : ":BLACKLISTED";
            StringBuilder sb7 = new StringBuilder(String.valueOf(str9).length() + 21 + str11.length());
            sb7.append(str9);
            sb7.append(":");
            sb7.append(j);
            sb7.append(str11);
            printWriter2.println(sb7.toString());
            printWriter2.println("-----");
            int size4 = hhp.d.size();
            if (size4 > 0) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Last ");
                sb8.append(size4);
                sb8.append(" status update");
                if (size4 > 1) {
                    str10 = "s";
                }
                sb8.append(str10);
                sb8.append(" (Number, Description):\n\n");
                int i13 = 0;
                while (i13 < size4) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    i13++;
                    objArr[0] = Integer.valueOf(i13);
                    int a5 = hhn.a(((hho) hhp.d.get(i13)).b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    switch (a5 - 1) {
                        case 0:
                            str2 = "Unknown";
                            break;
                        case 1:
                            str2 = "Accepted";
                            break;
                        case 2:
                            str2 = "OfferedByServer";
                            break;
                        case 3:
                            str2 = "ModuleSetMergeError";
                            break;
                        case 4:
                            str2 = "OverriddenByNewerVersion";
                            break;
                        case 5:
                            str2 = "ModuleSetBlacklisted";
                            break;
                        case 6:
                            str2 = "ZappDownloadFailed";
                            break;
                        case 7:
                            str2 = "ConfigResolutionAttempted";
                            break;
                        case 8:
                            str2 = "Unavailable";
                            break;
                        case 9:
                            str2 = "ConfigResolutionRejected";
                            break;
                        case 10:
                            str2 = "IncorrectLocalTargeting";
                            break;
                        case 11:
                            str2 = "TooManyModuleSetInfos";
                            break;
                        case 12:
                            str2 = "NoLongerOfferedByServer";
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                            str2 = "NoEnabledFeaturesOrApks";
                            break;
                        case UrlRequest.Status.READING_RESPONSE /*14*/:
                            str2 = "UnsupportedTargetingType";
                            break;
                        default:
                            str2 = "NotDownloadedMeteredNetwork";
                            break;
                    }
                    objArr[1] = str2;
                    sb8.append(String.format(locale, "%2d) %25s \n", objArr));
                }
                str = sb8.toString();
            } else {
                str = "No status updates.";
            }
            printWriter2.println(str);
            printWriter.println();
        }
        String valueOf5 = String.valueOf(Base64.encodeToString((byte[]) heh.d.c(), 2));
        printWriter2.println(valueOf5.length() == 0 ? new String("\nmodule_set_list: ") : "\nmodule_set_list: ".concat(valueOf5));
        String valueOf6 = String.valueOf(Base64.encodeToString((byte[]) heh.b.c(), 2));
        printWriter2.println(valueOf6.length() == 0 ? new String("required_features: ") : "required_features: ".concat(valueOf6));
        aucd o = bod.b.o();
        o.i((Iterable) blg.a(this.e).d());
        String valueOf7 = String.valueOf(Base64.encodeToString(((bod) o.i()).k(), 2));
        printWriter2.println(valueOf7.length() == 0 ? new String("requested_features: ") : "requested_features: ".concat(valueOf7));
    }

    public final String getType(Uri uri) {
        String str;
        if (bmv.a.match(uri) != 1) {
            str = null;
        } else {
            str = "vnd.android.cursor.item/features";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int match = d.match(uri);
        if (match == 1 || match == 2) {
            return "vnd.android.cursor.item/api";
        }
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        ParcelFileDescriptor dup;
        int match = d.match(uri);
        if (match != 1 && match != 2) {
            return super.openFile(uri, str);
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No configLastModTime in openFile");
            return null;
        }
        try {
            long parseLong = Long.parseLong(pathSegments.get(1));
            bkv a = bkv.a(this.e);
            try {
                synchronized (a.e) {
                    a.f();
                    FileInputStream fileInputStream = a.f;
                    if ((parseLong == -1 || parseLong == a.g) && fileInputStream != null) {
                        dup = ParcelFileDescriptor.dup(fileInputStream.getFD());
                    } else {
                        throw new InvalidConfigException("module configuration is not current");
                    }
                }
                return dup;
            } catch (InvalidConfigException | IOException e2) {
                String valueOf = String.valueOf(e2.toString());
                Log.e("GmsModuleProvider", valueOf.length() == 0 ? new String("Failed to get config file descriptor: ") : "Failed to get config file descriptor: ".concat(valueOf));
                return null;
            }
        } catch (NumberFormatException e3) {
            String valueOf2 = String.valueOf(e3.toString());
            Log.e("GmsModuleProvider", valueOf2.length() == 0 ? new String("Invalid configLastModTime in openFile: ") : "Invalid configLastModTime in openFile: ".concat(valueOf2));
            return null;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        int match = d.match(uri);
        MatrixCursor matrixCursor = null;
        if (match == 1) {
            z = false;
        } else if (match != 2) {
            if (bmv.a.match(uri) != 1) {
                int i = Build.VERSION.SDK_INT;
                String callingPackage = getCallingPackage();
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(callingPackage).length() + 23 + String.valueOf(valueOf).length());
                sb.append("Unhandled query from ");
                sb.append(callingPackage);
                sb.append(": ");
                sb.append(valueOf);
                Log.e("ModuleProvider", sb.toString());
            } else {
                matrixCursor = new MatrixCursor(bmu.a);
                boz a = a();
                if (a != null) {
                    int e2 = a.e();
                    apxg apxg = new apxg();
                    for (int i2 = 0; i2 < e2; i2++) {
                        a.a(apxg, i2);
                        matrixCursor.addRow(new Object[]{apxg.Q(), Long.valueOf(apxg.s())});
                    }
                }
            }
            return matrixCursor;
        } else {
            z = true;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2 || pathSegments.get(1).isEmpty()) {
            Log.e("GmsModuleProvider", "No featureName in query.");
            return null;
        }
        StrictMode.ThreadPolicy a2 = jlg.a();
        try {
            return hff.a().a(this.e, this.f, uri, z, awxs.a.a().s());
        } finally {
            StrictMode.setThreadPolicy(a2);
        }
    }

    public final boolean onCreate() {
        Context context = getContext();
        amtf.a((Object) context);
        this.b = context;
        Context context2 = getContext();
        amtf.a((Object) context2);
        this.e = context2;
        this.f = new jlm(context2);
        hem.a();
        return true;
    }
}
