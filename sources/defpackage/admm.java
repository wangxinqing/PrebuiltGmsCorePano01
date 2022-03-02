package defpackage;

import android.content.Context;
import android.os.RecoverySystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: admm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admm extends adlq {
    public static final adro e = new adro("file_path", "");
    private static final iwd f = adnt.e("NonStreamingProcessPackageAction");
    private final Context g;
    private final adrn h = ((adrn) adrn.a.b());
    private final adla i = ((adla) adla.h.b());

    public admm(Context context, adre adre) {
        super("non-streaming-process-package", adre);
        this.g = context;
    }

    public final adll c() {
        ZipFile zipFile;
        ZipFile zipFile2;
        Throwable th;
        long j;
        ArrayList arrayList;
        this.i.a(3, -1.0d);
        File file = new File((String) a(e));
        boolean z = true;
        try {
            zipFile = new ZipFile(file);
            this.h.a(adls.g.b(amri.b(adkb.a(zipFile))));
            zipFile.close();
            if (adjw.a()) {
                iva.a(jkr.c());
                ArrayList arrayList2 = new ArrayList();
                zipFile2 = new ZipFile(file);
                Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                adqr adqr = null;
                long j2 = 0;
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (zipEntry.getExtra() != null) {
                        j = (long) zipEntry.getExtra().length;
                    } else {
                        j = 0;
                    }
                    ArrayList arrayList3 = arrayList2;
                    j2 += ((long) (name.length() + 30)) + j;
                    if (!zipEntry.isDirectory()) {
                        long compressedSize = zipEntry.getCompressedSize();
                        if ("payload.bin".equals(name)) {
                            arrayList = arrayList3;
                            if (zipEntry.getMethod() == 0) {
                                aucd o = adqr.d.o();
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                adqr adqr2 = (adqr) o.b;
                                "payload.bin".getClass();
                                adqr2.a = "payload.bin";
                                adqr2.b = j2;
                                adqr2.c = compressedSize;
                                adqr = (adqr) o.i();
                            } else {
                                throw new IOException("Invalid compression method.");
                            }
                        } else if (!"payload_properties.txt".equals(name)) {
                            arrayList = arrayList3;
                        } else {
                            InputStream inputStream = zipFile2.getInputStream(zipEntry);
                            if (inputStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                                ArrayList arrayList4 = new ArrayList();
                                anng anng = new anng(bufferedReader);
                                while (true) {
                                    String a = anng.a();
                                    if (a == null) {
                                        break;
                                    }
                                    arrayList4.add(a);
                                    arrayList3 = arrayList3;
                                }
                                arrayList = arrayList3;
                                arrayList.addAll(arrayList4);
                            } else {
                                arrayList = arrayList3;
                            }
                        }
                        j2 += compressedSize;
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList3;
                    }
                }
                ArrayList arrayList5 = arrayList2;
                zipFile2.close();
                if (adqr != null) {
                    aucd o2 = adqq.d.o();
                    String valueOf = String.valueOf(file.getAbsolutePath());
                    String str = valueOf.length() == 0 ? new String("file://") : "file://".concat(valueOf);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    adqq adqq = (adqq) o2.b;
                    str.getClass();
                    adqq.a = str;
                    adqr.getClass();
                    adqq.c = adqr;
                    o2.ah(arrayList5);
                    this.h.a(adls.h.b(amri.b((adqq) o2.i())));
                } else {
                    throw new IOException("Failed to find payload entry in the given package.");
                }
            }
            RecoverySystem.verifyPackage(file, (RecoverySystem.ProgressListener) null, (File) null);
            if (adjw.a()) {
                admy.a(file);
            }
            if (!adjw.a()) {
                if (adki.b(this.g, this.i.d())) {
                    try {
                        f.c("Processing the package...", new Object[0]);
                        RecoverySystem.processPackage(this.g, file, (RecoverySystem.ProgressListener) null);
                    } catch (IOException e2) {
                        f.e("Error processing the package.", e2, new Object[0]);
                        z = false;
                    }
                } else {
                    z = false;
                }
                adrd a2 = adre.a();
                a2.a(admj.e, (String) a().a((adri) e));
                a2.a(admj.f, Boolean.valueOf(z));
                return new adll("non-ab-reboot", a2.a());
            }
            adrd a3 = adre.a();
            a3.a(admk.e.b((String) a().a((adri) e)));
            return new adll("non-streaming-ab-apply", a3.a());
        } catch (IOException | GeneralSecurityException e3) {
            f.e("Package verification failed.", e3, new Object[0]);
            this.i.a(!adjw.a() ? 263 : 274, -1.0d);
            adrn adrn = (adrn) adrn.a.b();
            adrn.a(adls.e.b(Integer.valueOf(((Integer) adrn.a((adri) adls.e).b).intValue() + 1)));
            return admq.a(this.g, false);
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }
}
