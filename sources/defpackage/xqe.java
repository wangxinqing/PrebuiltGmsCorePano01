package defpackage;

import android.content.ContentProvider;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: xqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xqe implements ContentProvider.PipeDataWriter {
    final aucd a;

    public xqe(aucd aucd) {
        this.a = aucd;
    }

    public final /* bridge */ /* synthetic */ void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri, String str, Bundle bundle, Object obj) {
        InputStream inputStream = (InputStream) obj;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[1024];
                    long currentTimeMillis = System.currentTimeMillis();
                    do {
                        try {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    inputStream.close();
                                    break;
                                } catch (IOException e) {
                                    e = e;
                                }
                            }
                        } catch (IOException e2) {
                            aucd aucd = this.a;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            xlj xlj = (xlj) aucd.b;
                            xlj xlj2 = xlj.g;
                            xlj.c = 13;
                            xlj.a |= 2;
                            Log.e("Gal2ProviderPhotoImpl", "read photo data exception: ", e2);
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e = e3;
                            }
                        }
                    } while (System.currentTimeMillis() - currentTimeMillis <= TimeUnit.SECONDS.toMillis(ayuk.i()));
                    aucd aucd2 = this.a;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    xlj xlj3 = (xlj) aucd2.b;
                    xlj xlj4 = xlj.g;
                    xlj3.c = 12;
                    xlj3.a |= 2;
                    Log.e("Gal2ProviderPhotoImpl", "openFile timed out");
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } else {
                Log.e("Gal2ProviderPhotoImpl", "Input stream cannot be null.");
            }
            fileOutputStream.close();
            Log.e("Gal2ProviderPhotoImpl", "Unable to close input stream", e);
            fileOutputStream.close();
        } catch (IOException e5) {
            Log.e("Gal2ProviderPhotoImpl", "Unable to close output stream");
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }
}
