package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: see  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class see {
    public final int a;
    private final amsv b;
    private final String c;

    public static ost b(Uri uri) {
        osu b2 = axsy.b();
        if (b2 != null) {
            ost a2 = sea.a(uri, b2.a);
            if (a2 != null) {
                return a2;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Access denied to uri: ");
            sb.append(valueOf);
            throw new sef(new Status(10, sb.toString()), 5);
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
        sb2.append("Error in the P/H configuration ");
        sb2.append(valueOf2);
        throw new sef(new Status(13, sb2.toString()), 10);
    }

    public final void a(Uri uri) {
        ost b2 = b(uri);
        oss oss = b2.c;
        if (oss == null) {
            oss = oss.c;
        }
        a(oss, uri);
        if (uri.getPathSegments().size() != new Uri.Builder().path(b2.a).build().getPathSegments().size() + 1) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Subdirectory system not supported: ");
            sb.append(valueOf);
            throw new sef(new Status(10, sb.toString()), 5);
        }
    }

    public see(amsv amsv, String str, int i) {
        this.a = i;
        this.b = amsv;
        this.c = str;
    }

    public final void a(oss oss, Uri uri) {
        boolean z;
        osw osw;
        int i = this.a;
        if (i == 0) {
            z = true;
        } else {
            z = i == 1;
        }
        int i2 = oss.a;
        if (i2 != 1 && !z) {
            String valueOf = String.valueOf(this.c);
            throw new sef(new Status(10, valueOf.length() == 0 ? new String("Expecting a google signed package but got : ") : "Expecting a google signed package but got : ".concat(valueOf)), 11);
        }
        amsv amsv = this.b;
        String str = this.c;
        int b2 = osr.b(i2);
        int i3 = b2 - 1;
        if (b2 == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3 && i == 0) {
                        return;
                    }
                } else if (i == 0 || i == 1) {
                    if (oss.a == 3) {
                        osw = (osw) oss.b;
                    } else {
                        osw = osw.b;
                    }
                    aucx aucx = osw.a;
                    int size = aucx.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        osv osv = (osv) aucx.get(i4);
                        if (TextUtils.equals(osv.a, str)) {
                            osx osx = osv.b;
                            if (osx == null) {
                                osx = osx.b;
                            }
                            if (!osx.a.isEmpty()) {
                                try {
                                    int i5 = ((PackageManager) amsv.a()).getPackageInfo(str, 0).versionCode;
                                    osx osx2 = osv.b;
                                    if (osx2 == null) {
                                        osx2 = osx.b;
                                    }
                                    if (!osx2.a.contains(Long.valueOf((long) i5))) {
                                        return;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    String valueOf2 = String.valueOf(e.getClass().getName());
                                    throw new sef(new Status(10, valueOf2.length() == 0 ? new String("Could not retrieve calling package info. Error: ") : "Could not retrieve calling package info. Error: ".concat(valueOf2)), 5);
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            } else if (i == 0 || i == 1) {
                return;
            }
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 22);
            sb.append("Access denied to uri: ");
            sb.append(valueOf3);
            throw new sef(new Status(10, sb.toString()), 5);
        }
    }
}
