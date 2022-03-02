package defpackage;

import android.app.Dialog;
import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: gja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gja extends DialogFragment implements LoaderManager.LoaderCallbacks {
    private static final iwd b = ehv.a("AuthManaged", "ProgressDialogFragment");
    protected ProgressDialog a;
    private gjh c;
    private byte[] d;
    private avwi e;

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (((giz) getActivity()) != null) {
            ((giz) getActivity()).b(i);
        }
        dismissAllowingStateLoss();
    }

    public final void b(int i) {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null) {
            progressDialog.setMessage(getArguments().getCharSequence("message"));
            this.a.setProgress(i);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = gjh.a();
        byte[] byteArray = getArguments().getByteArray("packageInformationBytes");
        this.d = byteArray;
        avwi a2 = this.c.a(byteArray);
        this.e = a2;
        if (a2 == null) {
            a(1);
        }
        if (awpr.c()) {
            gji.a((Context) getActivity()).a(10, this.e);
        }
        getLoaderManager().initLoader(1, (Bundle) null, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 4) {
            return;
        }
        if (i2 == -1) {
            if (awpr.c()) {
                gji.a((Context) getActivity()).a(13, this.e);
            }
            a(2);
            return;
        }
        a(1);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(0);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.a = progressDialog;
        progressDialog.setTitle(getArguments().getCharSequence("title"));
        this.a.setMessage(getArguments().getCharSequence("message"));
        this.a.setProgressStyle(1);
        this.a.setCancelable(true);
        this.a.setCanceledOnTouchOutside(false);
        this.a.setProgressNumberFormat((String) null);
        this.a.setButton(-2, getText(R.string.common_cancel), new giy(this));
        return this.a;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1) {
            return new giq(getActivity(), getArguments().getLong("downloadRequestId"));
        }
        if (i == 2) {
            return new gis(getActivity(), getArguments().getLong("downloadRequestId"), this.e);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int read;
        Uri uri;
        Integer num = (Integer) obj;
        int id = loader.getId();
        if (id == 1) {
            b.b(String.format(Locale.US, "onAppDownloadLoaderFinished with progress: %d", new Object[]{num}), new Object[0]);
            if (num.intValue() == 101) {
                b(98);
                if (awpr.c()) {
                    gji.a((Context) getActivity()).a(11, this.e);
                }
                if (awpr.c()) {
                    gji.a((Context) getActivity()).a(12, this.e);
                }
                ParcelFileDescriptor parcelFileDescriptor = null;
                if (jkr.e() || !awpo.a.a().a()) {
                    getLoaderManager().initLoader(2, (Bundle) null, this);
                    return;
                }
                b.b("verify and start install with direct intent", new Object[0]);
                long j = getArguments().getLong("downloadRequestId");
                avwi avwi = this.e;
                DownloadManager downloadManager = (DownloadManager) getContext().getSystemService("download");
                iwd iwd = b;
                String valueOf = String.valueOf(avwi.b);
                iwd.b(valueOf.length() == 0 ? new String("Verifying package ") : "Verifying package ".concat(valueOf), new Object[0]);
                try {
                    ParcelFileDescriptor openDownloadedFile = downloadManager.openDownloadedFile(j);
                    if (openDownloadedFile != null) {
                        try {
                            gjh gjh = this.c;
                            FileInputStream fileInputStream = new FileInputStream(openDownloadedFile.getFileDescriptor());
                            MessageDigest a2 = jhh.a("SHA1");
                            byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                            do {
                                read = fileInputStream.read(bArr);
                                if (read > 0) {
                                    a2.update(bArr, 0, read);
                                    continue;
                                }
                            } while (read != -1);
                            if (gjh.a(a2.digest(), avwi)) {
                                b.b("Package verified", new Object[0]);
                                jjt.a(openDownloadedFile);
                                iwd iwd2 = b;
                                String valueOf2 = String.valueOf(avwi.b);
                                iwd2.b(valueOf2.length() == 0 ? new String("Installing package ") : "Installing package ".concat(valueOf2), new Object[0]);
                                Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                                if (jkr.c()) {
                                    uri = downloadManager.getUriForDownloadedFile(j);
                                } else {
                                    DownloadManager.Query query = new DownloadManager.Query();
                                    query.setFilterById(new long[]{j});
                                    Cursor query2 = downloadManager.query(query);
                                    query2.moveToFirst();
                                    String string = query2.getString(query2.getColumnIndex("local_filename"));
                                    query2.close();
                                    uri = Uri.fromFile(new File(string));
                                }
                                intent.setData(uri);
                                intent.setFlags(1);
                                intent.putExtra("android.intent.extra.ALLOW_REPLACE", true);
                                intent.putExtra("android.intent.extra.RETURN_RESULT", true);
                                intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                                intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", getContext().getPackageName());
                                startActivityForResult(intent, 4);
                                return;
                            }
                            b.d("Package contents mismatch.", new Object[0]);
                            jjt.a(openDownloadedFile);
                            a(1);
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            parcelFileDescriptor = openDownloadedFile;
                            b.d("Cannot find downloaded file.", e, new Object[0]);
                            jjt.a(parcelFileDescriptor);
                            a(1);
                        } catch (IOException e3) {
                            e = e3;
                            parcelFileDescriptor = openDownloadedFile;
                            b.d("IOException while calculating SHA1", e, new Object[0]);
                            jjt.a(parcelFileDescriptor);
                            a(1);
                        } catch (Throwable th) {
                            th = th;
                            parcelFileDescriptor = openDownloadedFile;
                            jjt.a(parcelFileDescriptor);
                            throw th;
                        }
                    } else {
                        b.d("Cannot find downloaded file.", new Object[0]);
                        jjt.a(parcelFileDescriptor);
                        a(1);
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    b.d("Cannot find downloaded file.", e, new Object[0]);
                    jjt.a(parcelFileDescriptor);
                    a(1);
                } catch (IOException e5) {
                    e = e5;
                    b.d("IOException while calculating SHA1", e, new Object[0]);
                    jjt.a(parcelFileDescriptor);
                    a(1);
                } catch (Throwable th2) {
                    th = th2;
                    jjt.a(parcelFileDescriptor);
                    throw th;
                }
            } else if (num.intValue() == -2) {
                a(1);
            } else if (num.intValue() == -1) {
                ProgressDialog progressDialog = this.a;
                if (progressDialog != null) {
                    progressDialog.setMessage(getArguments().getCharSequence("pausedMessage"));
                }
            } else {
                b((num.intValue() * 98) / 100);
            }
        } else if (id != 2) {
        } else {
            if (num.intValue() == 101) {
                if (awpr.c()) {
                    gji.a((Context) getActivity()).a(13, this.e);
                }
                a(2);
            } else if (num.intValue() == -1) {
                a(1);
            } else if (num.intValue() == -2) {
                a(3);
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
