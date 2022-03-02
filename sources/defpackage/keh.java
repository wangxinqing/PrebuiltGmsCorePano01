package defpackage;

import android.database.SQLException;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: keh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class keh implements kei {
    public static final ith a = new ith("HashBasedOpenContentsSt", "");
    public final AtomicInteger b = new AtomicInteger(2);
    private final SparseArray c = new SparseArray();
    private final kdb d;
    private final khx e;
    private final khw f;

    public keh(kdb kdb, khx khx, jiq jiq, khw khw) {
        iva.a((Object) kdb);
        this.d = kdb;
        iva.a((Object) khx);
        this.e = khx;
        iva.a((Object) jiq);
        iva.a((Object) khw);
        this.f = khw;
    }

    private final synchronized DriveId a(khq khq, keg keg, MetadataBundle metadataBundle, DriveId driveId, kdo kdo) {
        int i;
        DriveId driveId2;
        iva.a((Object) keg.d);
        try {
            khs khs = (khs) keg.d.a(new khz(khq.a, khq.c, metadataBundle, driveId, this.d, kdo));
            iva.a((Object) khs);
            int i2 = khs.a;
            kav kav = (kav) khs.b;
            if (i2 == 0) {
                this.f.a();
                driveId2 = kav.g;
                a(keg);
            } else {
                if (i2 != 3) {
                    i = i2 == 4 ? 1501 : 8;
                } else {
                    i = 1502;
                }
                throw new nja(i, "Failed to create the file.");
            }
        } catch (IOException e2) {
            throw new nja(8, "Failed to commit file because of an I/O error.");
        } catch (Throwable th) {
            a(keg);
            throw th;
        }
        return driveId2;
    }

    private final synchronized void b(keg keg) {
        try {
            keg.g.linkToDeath(keg, 0);
            this.c.put(keg.a, keg);
            this.f.a((Collection) a());
        } catch (RemoteException e2) {
            throw new nja(8, "Unable to link client");
        }
    }

    private final synchronized Set a() {
        anav anav;
        anav = new anav();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            String str = ((keg) this.c.valueAt(i)).c;
            if (str != null) {
                anav.b(str);
            }
        }
        return anav.a();
    }

    private final synchronized keg a(int i) {
        return (keg) this.c.get(i);
    }

    private final synchronized void a(khq khq, keg keg, MetadataBundle metadataBundle, knc knc, kdo kdo) {
        int i;
        khq khq2 = khq;
        keg keg2 = keg;
        synchronized (this) {
            iva.a((Object) keg2.d);
            try {
                khs khs = (khs) keg2.d.a(new khu(khq2.a, khq2.c, knc, metadataBundle, this.d, keg2.c, kdo));
                iva.a((Object) khs);
                int i2 = khs.a;
                if (i2 != 0) {
                    if (i2 == 2) {
                        i = 1502;
                    } else {
                        i = 8;
                    }
                    throw new nja(i, "Failed to commit changes.");
                }
                this.f.a();
                a(keg2);
            } catch (IOException e2) {
                throw new nja(8, "Failed to commit file because of an I/O error.");
            } catch (Throwable th) {
                a(keg2);
                throw th;
            }
        }
    }

    public final long a(khq khq, int i) {
        a(khq.c, i);
        keg a2 = a(i);
        iva.a((Object) a2.d);
        try {
            return a2.d.e();
        } catch (IOException e2) {
            throw new nja(8, "Failed to get file size because of an I/O error.");
        }
    }

    public final ParcelFileDescriptor a(kmp kmp) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = this.e.a(kmp.q());
        } catch (SQLException | IOException e2) {
            a.c("HashBasedOpenContentsSt", "Exception occurred while opening file", e2);
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor;
        }
        a.c("HashBasedOpenContentsSt", "Unable to open file.");
        throw new nja(8, "Unable to open file.");
    }

    public final Contents a(khq khq, int i, IBinder iBinder) {
        return a(khq, (kmp) null, 0, i, iBinder);
    }

    public final Contents a(khq khq, kmp kmp, int i, int i2, IBinder iBinder) {
        DriveId driveId;
        Object obj;
        String str;
        String str2;
        kie kie;
        ParcelFileDescriptor parcelFileDescriptor;
        knc knc;
        boolean z;
        khq khq2 = khq;
        int i3 = i;
        int i4 = i2;
        if (kmp != null) {
            driveId = kmp.g();
        } else {
            driveId = null;
        }
        iva.b(driveId != null ? true : i4 != 268435456, "New files must not be created with MODE_READ_ONLY.");
        iva.b(i3 == 0 ? true : i4 == 536870912, "baseRequestId must be used with MODE_WRITE_ONLY.");
        iva.b(i4 == 536870912 ? true : i4 == 268435456 || i4 == 805306368, "Invalid mode");
        Object obj2 = this.f.f;
        synchronized (obj2) {
            if (i3 != 0) {
                try {
                    a(khq2.c, i3);
                    keg a2 = a(i3);
                    if (a2.d == null) {
                        str = a2.c;
                        a(a2);
                        str2 = null;
                    } else {
                        throw new nja(8, "Only READ_ONLY contents may be reopenForWrite().");
                    }
                } catch (Throwable th) {
                    th = th;
                    obj = obj2;
                    throw th;
                }
            } else if (kmp != null) {
                str = kmp.q();
                str2 = str == null ? null : i4 != 536870912 ? kmp.r() : null;
            } else {
                str2 = null;
                str = null;
            }
            Pair pair = new Pair(str, str2);
            String str3 = (String) pair.first;
            String str4 = (String) pair.second;
            if (i4 == 268435456) {
                parcelFileDescriptor = this.e.a(str3);
                kie = null;
            } else if (i4 == 536870912) {
                kie = this.e.a(536870912);
                parcelFileDescriptor = kie.a();
            } else if (i4 == 805306368) {
                if (str3 == null) {
                    try {
                        kie = this.e.a(805306368);
                    } catch (IOException e2) {
                        Object obj3 = obj2;
                        a.c("HashBasedOpenContentsSt", String.format("Unable to open file with hash: %s", new Object[]{str3}), e2);
                        throw new nja(8, "Unable to open file.");
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    khx khx = this.e;
                    ParcelFileDescriptor a3 = khx.a(str3);
                    if (a3 != null) {
                        String uuid = UUID.randomUUID().toString();
                        khx.c.e(uuid);
                        jjt.a(new ParcelFileDescriptor.AutoCloseInputStream(a3), new FileOutputStream(khx.a(uuid, 0)), true);
                        kie = new kie(khx.b, khx.c, khx.d, khx, uuid, 805306368);
                    } else {
                        kie = null;
                    }
                }
                if (kie != null) {
                    parcelFileDescriptor = kie.a();
                } else {
                    parcelFileDescriptor = null;
                }
            } else {
                throw new nja(10, "Unrecognized mode.");
            }
            if (parcelFileDescriptor == null) {
                String valueOf = String.valueOf(str3);
                throw new nja(8, valueOf.length() == 0 ? new String("Content is not available locally: ") : "Content is not available locally: ".concat(valueOf));
            }
            Pair pair2 = new Pair(parcelFileDescriptor, kie);
            if (kmp != null) {
                knc = kmp.a();
            } else {
                knc = null;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) pair2.first;
            kie kie2 = (kie) pair2.second;
            String str5 = str3;
            AppIdentity appIdentity = khq2.c;
            keg keg = r1;
            obj = obj2;
            keg keg2 = new keg(this, parcelFileDescriptor2, kie2, knc, appIdentity, iBinder, str5);
            b(keg);
            if (i4 == 805306368) {
                z = true;
            } else {
                z = i3 != 0;
            }
            Contents contents = new Contents((ParcelFileDescriptor) pair2.first, keg.a, i2, driveId, z, str4);
            return contents;
        }
    }

    public final synchronized DriveId a(khq khq, int i, MetadataBundle metadataBundle, DriveId driveId, kdo kdo) {
        keg a2;
        a(khq.c, i);
        iva.a((Object) metadataBundle);
        a2 = a(i);
        if (a2.e == null) {
        } else {
            throw new nja(10, "Cannot create a new file using contents opened from an existing file.Use DriveResourceClient.createContents() to create the contents instead.");
        }
        return a(khq, a2, metadataBundle, driveId, kdo);
    }

    public final void a(AppIdentity appIdentity, int i) {
        keg a2 = a(i);
        if (a2 == null) {
            throw new nja(10, "Contents already closed.");
        } else if (!ius.a(a2.f, appIdentity)) {
            throw new nja(10, String.format(Locale.US, "App %s cannot verify ownership of this file because it was opened by different app.", new Object[]{appIdentity}));
        }
    }

    public final synchronized void a(keg keg) {
        keg.a();
        this.c.remove(keg.a);
        this.f.a((Collection) a());
    }

    public final void a(khq khq, int i, MetadataBundle metadataBundle, boolean z, kdo kdo) {
        knc knc;
        a(khq.c, i);
        keg a2 = a(i);
        iva.b(!metadataBundle.c(lce.M));
        if (kdo.a()) {
            if (!z) {
                throw new nja(8, "Can't detect conflicts without saveResults");
            } else if (a2.c == null) {
                throw new nja(8, "Can't detect conflicts without baseContentHash");
            }
        }
        if (z && a2.d == null) {
            throw new nja(8, "Can't save contents opened for READ_ONLY.");
        } else if (!z || (knc = a2.e) == null) {
            a(a2);
        } else {
            a(khq, a2, metadataBundle, knc, kdo);
        }
    }
}
