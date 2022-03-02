package defpackage;

import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.mdd.OverrideFileGroupRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: sck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sck implements aora {
    final /* synthetic */ scl a;

    public sck(scl scl) {
        this.a = scl;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Status status;
        int i;
        Void voidR = (Void) obj;
        scl scl = this.a;
        sbw sbw = scl.a;
        OverrideFileGroupRequest overrideFileGroupRequest = scl.b;
        String str = overrideFileGroupRequest.a;
        if (overrideFileGroupRequest.d.length == overrideFileGroupRequest.e.length) {
            SharedPreferences sharedPreferences = sbw.b.getSharedPreferences("gms_icing_mdd_overrider_groups", 0);
            long j = sharedPreferences.getLong("_key_next_file_name", System.currentTimeMillis());
            int length = overrideFileGroupRequest.c.length;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                String[] strArr = overrideFileGroupRequest.d;
                if (i2 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i2];
                ParcelFileDescriptor parcelFileDescriptor = overrideFileGroupRequest.e[i2];
                if (length == 0) {
                    i = 1;
                } else {
                    i = 2;
                }
                try {
                    File b = ahab.a(sbw.b).b(afsp.a(sbw.b, i, ampu.a));
                    long j2 = j + 1;
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("datadownloadfile_override_");
                    sb.append(j);
                    File file = new File(b, sb.toString());
                    File parentFile = file.getParentFile();
                    iva.a((Object) parentFile);
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.getAbsolutePath();
                    try {
                        jjc.a((InputStream) new FileInputStream(parcelFileDescriptor.getFileDescriptor()), file);
                        parcelFileDescriptor.close();
                        agzz a2 = ahaa.a(sbw.b);
                        a2.a(file);
                        arrayList.add(new MddFile(str2, a2.a().toString()));
                        i2++;
                        j = j2;
                    } catch (IOException e) {
                        afsh.a("IOException occurred while copying files to mdd directory");
                    }
                } catch (IOException e2) {
                    afsh.a("IOException occurred while getting file path");
                }
            }
            if (sharedPreferences.edit().putLong("_key_next_file_name", j).commit()) {
                FileGroupResponse fileGroupResponse = new FileGroupResponse(overrideFileGroupRequest.a, overrideFileGroupRequest.b, 0, arrayList);
                sbw.a.put(sbw.a(overrideFileGroupRequest.a, overrideFileGroupRequest.b, overrideFileGroupRequest.f), fileGroupResponse);
                status = Status.a;
                scl scl2 = this.a;
                OverrideFileGroupRequest overrideFileGroupRequest2 = scl2.b;
                Object[] objArr = {"Service", overrideFileGroupRequest2.a, overrideFileGroupRequest2.b};
                scl2.c.a(status);
            }
        }
        status = new Status(13);
        scl scl22 = this.a;
        OverrideFileGroupRequest overrideFileGroupRequest22 = scl22.b;
        Object[] objArr2 = {"Service", overrideFileGroupRequest22.a, overrideFileGroupRequest22.b};
        try {
            scl22.c.a(status);
        } catch (RemoteException e3) {
            afsh.b((Throwable) e3, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        try {
            this.a.a(Status.c);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }
}
