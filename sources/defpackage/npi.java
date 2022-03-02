package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: npi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npi {
    public final Context a;
    private final nnt b;

    public npi(Context context, nnt nnt) {
        this.a = context;
        this.b = nnt;
    }

    private final String b() {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String a2 = amsl.OS_ARCH.a();
        if (!TextUtils.isEmpty(a2) && hashSet.contains(a2)) {
            return a2;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e) {
            nnt nnt = this.b;
            if (nnt != null) {
                nnt.a(2024, 0, e);
            }
        } catch (IllegalAccessException e2) {
            nnt nnt2 = this.b;
            if (nnt2 != null) {
                nnt2.a(2024, 0, e2);
            }
        }
        if (Build.CPU_ABI != null) {
            return Build.CPU_ABI;
        }
        return Build.CPU_ABI2;
    }

    public final bhs a() {
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            a((byte[]) null);
            return bhs.UNSUPPORTED;
        } else if (b2.equalsIgnoreCase("i686") || b2.equalsIgnoreCase("x86")) {
            return bhs.X86;
        } else {
            if (b2.equalsIgnoreCase("x86_64")) {
                return bhs.X86_64;
            }
            if (b2.equalsIgnoreCase("arm64-v8a")) {
                return bhs.ARM64;
            }
            if (b2.equalsIgnoreCase("armeabi-v7a") || b2.equalsIgnoreCase("armv71")) {
                return bhs.ARM7;
            }
            a((byte[]) null);
            return bhs.UNSUPPORTED;
        }
    }

    public final void a(byte[] bArr) {
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(amsl.OS_ARCH.a());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            this.b.a(4007, 0, (Exception) null, (String) null, sb.toString());
        }
    }
}
