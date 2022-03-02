package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/* renamed from: bms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bms {
    private final int a;
    protected final Context e;
    protected final int f;
    public String g;
    public String h;
    public final bmr i;

    protected bms(Context context, int i2, int i3, bmr bmr) {
        this.e = context.getApplicationContext();
        this.a = i2;
        this.f = i3;
        this.i = bmr;
    }

    public static bms a(Context context, boy boy) {
        int a2 = bnj.a(boy.a());
        if (a2 == 0) {
            int a3 = boy.a();
            StringBuilder sb = new StringBuilder(44);
            sb.append("ModuleApk has invalid APK type (");
            sb.append(a3);
            sb.append(")");
            Log.e("ChimeraModuleApk", sb.toString());
            return null;
        }
        int a4 = bpc.a(boy.i());
        if (a4 == 0) {
            int i2 = boy.i();
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("ModuleApk has invalid source type (");
            sb2.append(i2);
            sb2.append(")");
            Log.e("ChimeraModuleApk", sb2.toString());
            return null;
        }
        return a(context, boy.b(), a2, boy.m(), a4, boy.l(), boy.n(), boy.o(), boy.p());
    }

    public abstract ApplicationInfo a();

    public abstract ClassLoader a(ClassLoader classLoader);

    /* access modifiers changed from: protected */
    public abstract boolean a(boy boy);

    public abstract String b();

    public Resources c() {
        try {
            Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(a());
            if (resourcesForApplication != null && resourcesForApplication.getAssets() != null) {
                return resourcesForApplication;
            }
            throw new bop(String.valueOf(toString()).concat(" resources are null"));
        } catch (Exception e2) {
            bla.a(this.e, 19, e2.toString());
            throw new bop("Error in getResources()", e2);
        }
    }

    public bnm e() {
        return (bnm) j().i();
    }

    public abstract bnm f();

    /* access modifiers changed from: protected */
    public aucd j() {
        aucd o = bnm.r.o();
        int i2 = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        bnm bnm = (bnm) o.b;
        bnm.b = i2 - 1;
        int i3 = bnm.a | 1;
        bnm.a = i3;
        int i4 = this.f;
        int i5 = i3 | 1024;
        bnm.a = i5;
        bnm.m = i4;
        bmr bmr = this.i;
        if (bmr != null) {
            String str = bmr.a;
            str.getClass();
            int i6 = i5 | FragmentTransaction.TRANSIT_ENTER_MASK;
            bnm.a = i6;
            bnm.o = str;
            String str2 = bmr.b;
            str2.getClass();
            bnm.a = i6 | FragmentTransaction.TRANSIT_EXIT_MASK;
            bnm.p = str2;
        }
        return o;
    }

    public brh k() {
        InputStream open;
        String valueOf = String.valueOf(toString());
        if (valueOf.length() == 0) {
            new String("Loading chimera manifest from ");
        } else {
            "Loading chimera manifest from ".concat(valueOf);
        }
        try {
            try {
                open = c().getAssets().open("ChimeraManifest.pb");
                brh a2 = a(open);
                if (open != null) {
                    open.close();
                }
                return a2;
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(this);
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 40 + String.valueOf(message).length());
                sb.append("Failed to read chimera manifests from ");
                sb.append(valueOf2);
                sb.append(": ");
                sb.append(message);
                Log.w("ChimeraModuleApk", sb.toString());
                return null;
            } catch (Throwable th) {
                apev.a(th, th);
            }
            throw th;
        } catch (PackageManager.NameNotFoundException | bop e3) {
            String valueOf3 = String.valueOf(e3.getMessage());
            Log.e("ChimeraModuleApk", valueOf3.length() == 0 ? new String("Failed to load module resources for manifest: ") : "Failed to load module resources for manifest: ".concat(valueOf3));
            return null;
        }
    }

    public final String m() {
        String b = b();
        if (b != null) {
            return Uri.fromFile(new File(b)).toString();
        }
        return null;
    }

    public final String n() {
        InputStream openRawResource;
        try {
            String str = f().f;
            Resources c = c();
            openRawResource = c.openRawResource(c.getIdentifier("third_party_licenses", "raw", str));
            String next = new Scanner(openRawResource).useDelimiter("\\A").next();
            if (openRawResource != null) {
                openRawResource.close();
            }
            return next;
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | bop | IOException e2) {
            String b = b();
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 41 + String.valueOf(valueOf).length());
            sb.append("Failed to get third party licenses for ");
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            sb.toString();
            return null;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public static bms a(Context context, String str, int i2, int i3, int i4, int i5, String str2, String str3, String str4) {
        bmr bmr;
        Context context2 = context;
        String str5 = str3;
        String str6 = str4;
        if (str == null) {
            Log.e("ChimeraModuleApk", "Unable to create ModuleApk from invalid descriptor (path null)");
            return null;
        }
        if (str5 != null && str6 != null) {
            bmr = new bmr(str5, str6);
        } else if (str5 == null && str6 == null) {
            bmr = null;
        } else {
            Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Invalid module.yaml info for apk: ") : "Invalid module.yaml info for apk: ".concat(str));
            return null;
        }
        int i6 = i2 - 1;
        if (i6 != 1) {
            if (i6 == 2) {
                int i7 = i3;
                return new bmb(context, i3, str);
            } else if (i6 != 3) {
                if (i6 != 4) {
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("Module APK type '");
                    sb.append(i6);
                    sb.append("' not supported");
                    Log.e("ChimeraModuleApk", sb.toString());
                    return null;
                } else if (str2 != null) {
                    Uri parse = Uri.parse(str2);
                    List<String> pathSegments = parse.getPathSegments();
                    if (!Objects.equals(parse.getScheme(), "split") || pathSegments.size() != 2) {
                        String valueOf = String.valueOf(parse);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
                        sb2.append("Bad source URI (");
                        sb2.append(valueOf);
                        sb2.append(") for split APK at ");
                        sb2.append(str);
                        Log.e("ChimeraSplitApk", sb2.toString());
                        return null;
                    } else if (!pathSegments.get(0).equals(context.getPackageName())) {
                        String valueOf2 = String.valueOf(pathSegments.get(0));
                        Log.e("ChimeraSplitApk", valueOf2.length() == 0 ? new String("Bad package name - cannot load split APKs from other packages: ") : "Bad package name - cannot load split APKs from other packages: ".concat(valueOf2));
                        return null;
                    } else {
                        return new bnf(context, i3, pathSegments.get(1), str, bmr);
                    }
                } else {
                    Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Missing source URI for split APK at ") : "Missing source URI for split APK at ".concat(str));
                    return null;
                }
            } else if (str2 != null) {
                return new blk(context, i3, str, i4, i5, str2, bmr);
            } else {
                Log.e("ChimeraModuleApk", str.length() == 0 ? new String("Missing source URI for file APK at ") : "Missing source URI for file APK at ".concat(str));
                return null;
            }
        } else if (str.equals(context.getPackageName())) {
            return new bkw(context);
        } else {
            Log.e("ChimeraModuleApk", "Unable to create ModuleApk from invalid descriptor (CONTAINER has incorrect package name)");
            return null;
        }
    }

    public static brh a(InputStream inputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        a(inputStream, allocate.array());
        allocate.order(ByteOrder.BIG_ENDIAN);
        byte[] bArr = new byte[allocate.getInt()];
        a(inputStream, bArr);
        return (brh) aucj.a((aucj) brh.b, bArr, aubs.b());
    }

    private static void a(InputStream inputStream, byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i2, length - i2);
            if (read <= 0) {
                break;
            }
            i2 += read;
        }
        if (i2 < length) {
            throw new IOException(String.format("Input file too short (expected %d, got %d)", new Object[]{Integer.valueOf(length), Integer.valueOf(i2)}));
        }
    }

    public boolean a(boy boy, boolean z) {
        return a(boy);
    }
}
