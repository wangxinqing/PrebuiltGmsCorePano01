package defpackage;

import android.os.Environment;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.update.ChimeraUpdateFromSdCardService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: adio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adio extends bhw implements IInterface {
    final /* synthetic */ ChimeraUpdateFromSdCardService a;

    public adio() {
        super("com.google.android.gms.update.IUpdateFromSdCardService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i == 3) {
                String readString = parcel.readString();
                String valueOf = String.valueOf(readString);
                if (valueOf.length() == 0) {
                    new String("listFilesInDirectory: ");
                } else {
                    "listFilesInDirectory: ".concat(valueOf);
                }
                ArrayList arrayList = new ArrayList();
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                if (readString != null) {
                    String valueOf2 = String.valueOf(absolutePath);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1 + readString.length());
                    sb.append(valueOf2);
                    sb.append("/");
                    sb.append(readString);
                    absolutePath = sb.toString();
                }
                for (File file : new File(absolutePath).listFiles()) {
                    if (file.isDirectory() && !file.isHidden()) {
                        arrayList.add(String.valueOf(file.getName()).concat("/"));
                    } else if (file.isFile() && !file.isHidden() && file.getName().endsWith(".zip")) {
                        try {
                            if (adjp.a(file) != null) {
                                arrayList.add(file.getName());
                            }
                        } catch (IOException e) {
                            Log.w("Exception while reading zip file.", e);
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
            } else if (i == 4) {
                String readString2 = parcel.readString();
                ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.a;
                String valueOf3 = String.valueOf(readString2);
                if (valueOf3.length() == 0) {
                    new String("verifyUpdate: ");
                } else {
                    "verifyUpdate: ".concat(valueOf3);
                }
                chimeraUpdateFromSdCardService.b = 3;
                chimeraUpdateFromSdCardService.a();
                wkg.a.a(new adjp(chimeraUpdateFromSdCardService), wkg.c(), readString2);
                parcel2.writeNoException();
            } else if (i == 5) {
                ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService2 = this.a;
                String valueOf4 = String.valueOf((Object) null);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 14);
                sb2.append("installUpdate ");
                sb2.append(valueOf4);
                sb2.toString();
                Log.e("CmaUpdateFromSdCardS", "no last verified file! cannot install");
                new adhz(chimeraUpdateFromSdCardService2).start();
                parcel2.writeNoException();
            } else if (i != 6) {
                return false;
            } else {
                ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService3 = this.a;
                chimeraUpdateFromSdCardService3.c = null;
                chimeraUpdateFromSdCardService3.b = 1;
                chimeraUpdateFromSdCardService3.a();
                parcel2.writeNoException();
            }
        } else {
            int i2 = this.a.b;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adio(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        super("com.google.android.gms.update.IUpdateFromSdCardService");
        this.a = chimeraUpdateFromSdCardService;
    }
}
