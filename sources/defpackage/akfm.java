package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: akfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class akfm extends AsyncTask {
    private final WeakReference a = new WeakReference((Object) null);
    protected boolean e = false;

    private final Bitmap a(Context context, Intent.ShortcutIconResource shortcutIconResource, akfl akfl) {
        Object obj;
        String str = shortcutIconResource.packageName;
        String str2 = shortcutIconResource.resourceName;
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
            if (resourcesForApplication != null) {
                int identifier = resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, (String) null, (String) null);
                if (identifier == 0) {
                    String str3 = shortcutIconResource.resourceName;
                    String str4 = shortcutIconResource.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 39 + String.valueOf(str4).length());
                    sb.append("Couldn't get resource ");
                    sb.append(str3);
                    sb.append(" in resources of ");
                    sb.append(str4);
                    Log.e("BitmapWorker", sb.toString());
                    obj = null;
                } else {
                    TypedValue typedValue = new TypedValue();
                    resourcesForApplication.getValue(identifier, typedValue, true);
                    if (typedValue.type != 3 || !typedValue.string.toString().endsWith(".xml")) {
                        if (typedValue.type >= 28) {
                            if (typedValue.type > 31) {
                            }
                        }
                        obj = resourcesForApplication.openRawResource(identifier, typedValue);
                    }
                    obj = resourcesForApplication.getDrawable(identifier);
                }
            } else {
                obj = null;
            }
            if (obj instanceof InputStream) {
                return a((InputStream) obj, akfl);
            }
            if (!(obj instanceof Drawable)) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb2.append("getBitmapFromResource failed, unrecognized resource: ");
                sb2.append(valueOf);
                Log.w("BitmapWorker", sb2.toString());
                return null;
            }
            Drawable drawable = (Drawable) obj;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = akfl.c;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = akfl.d;
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (PackageManager.NameNotFoundException e2) {
            String str5 = shortcutIconResource.packageName;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 38);
            sb3.append("Could not load package: ");
            sb3.append(str5);
            sb3.append("! NameNotFound");
            Log.w("BitmapWorker", sb3.toString());
            return null;
        } catch (Resources.NotFoundException e3) {
            String str6 = shortcutIconResource.resourceName;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 35);
            sb4.append("Could not load resource: ");
            sb4.append(str6);
            sb4.append("! NotFound");
            Log.w("BitmapWorker", sb4.toString());
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.BitmapFactory$Options} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Bitmap a(java.io.InputStream r8, defpackage.akfl r9) {
        /*
            r7 = this;
            r0 = 0
            aken r1 = new aken     // Catch:{ all -> 0x00b3 }
            r1.<init>(r8)     // Catch:{ all -> 0x00b3 }
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1.a = r8     // Catch:{ all -> 0x00b1 }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00b1 }
            r2.<init>()     // Catch:{ all -> 0x00b1 }
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap$Config r4 = r9.g     // Catch:{ all -> 0x00ae }
            akem r4 = defpackage.akem.a     // Catch:{ all -> 0x00ae }
            byte[] r4 = r4.a()     // Catch:{ all -> 0x00ae }
            r2.inTempStorage = r4     // Catch:{ all -> 0x00ae }
            r1.mark(r8)     // Catch:{ all -> 0x00ae }
            android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch:{ all -> 0x00ae }
            int r8 = r9.d     // Catch:{ all -> 0x00ae }
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r8 <= 0) goto L_0x002f
            int r5 = r2.outHeight     // Catch:{ all -> 0x00ae }
            float r5 = (float) r5     // Catch:{ all -> 0x00ae }
            float r8 = (float) r8     // Catch:{ all -> 0x00ae }
            float r5 = r5 / r8
            goto L_0x0031
        L_0x002f:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x0031:
            int r8 = r9.c     // Catch:{ all -> 0x00ae }
            if (r8 <= 0) goto L_0x003b
            int r6 = r2.outWidth     // Catch:{ all -> 0x00ae }
            float r6 = (float) r6     // Catch:{ all -> 0x00ae }
            float r8 = (float) r8     // Catch:{ all -> 0x00ae }
            float r6 = r6 / r8
            goto L_0x003d
        L_0x003b:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x003d:
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r5 = r6
        L_0x0043:
            r8 = 0
            r2.inJustDecodeBounds = r8     // Catch:{ all -> 0x00ae }
            r6 = 1073741824(0x40000000, float:2.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x004d
            goto L_0x0050
        L_0x004d:
            int r5 = (int) r5     // Catch:{ all -> 0x00ae }
            r2.inSampleSize = r5     // Catch:{ all -> 0x00ae }
        L_0x0050:
            r1.reset()     // Catch:{ all -> 0x00ae }
            r1.a = r8     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x00a2
            int r0 = r8.getHeight()     // Catch:{ all -> 0x00ae }
            int r5 = r9.d     // Catch:{ all -> 0x00ae }
            if (r0 <= r5) goto L_0x006b
            float r0 = (float) r5     // Catch:{ all -> 0x00ae }
            int r5 = r8.getHeight()     // Catch:{ all -> 0x00ae }
            float r5 = (float) r5     // Catch:{ all -> 0x00ae }
            float r0 = r0 / r5
            goto L_0x006d
        L_0x006b:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x006d:
            int r5 = r8.getWidth()     // Catch:{ all -> 0x00ae }
            int r9 = r9.c     // Catch:{ all -> 0x00ae }
            if (r5 <= r9) goto L_0x007d
            float r9 = (float) r9     // Catch:{ all -> 0x00ae }
            int r5 = r8.getWidth()     // Catch:{ all -> 0x00ae }
            float r5 = (float) r5     // Catch:{ all -> 0x00ae }
            float r9 = r9 / r5
            goto L_0x007f
        L_0x007d:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x007f:
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r0 = r9
        L_0x0085:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a0
            int r9 = r8.getWidth()     // Catch:{ all -> 0x00ae }
            int r4 = r8.getHeight()     // Catch:{ all -> 0x00ae }
            float r9 = (float) r9     // Catch:{ all -> 0x00ae }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x00ae }
            float r4 = (float) r4     // Catch:{ all -> 0x00ae }
            float r4 = r4 * r0
            int r0 = (int) r4     // Catch:{ all -> 0x00ae }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r8, r9, r0, r3)     // Catch:{ all -> 0x00ae }
            r7.e = r3     // Catch:{ all -> 0x00ae }
            goto L_0x00a3
        L_0x00a0:
            r0 = r8
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            akem r8 = defpackage.akem.a
            byte[] r9 = r2.inTempStorage
            r8.a(r9)
            r1.close()
            return r0
        L_0x00ae:
            r8 = move-exception
            r0 = r2
            goto L_0x00b5
        L_0x00b1:
            r8 = move-exception
            goto L_0x00b5
        L_0x00b3:
            r8 = move-exception
            r1 = r0
        L_0x00b5:
            if (r0 == 0) goto L_0x00be
            akem r9 = defpackage.akem.a
            byte[] r0 = r0.inTempStorage
            r9.a(r0)
        L_0x00be:
            if (r1 == 0) goto L_0x00c3
            r1.close()
        L_0x00c3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfm.a(java.io.InputStream, akfl):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap doInBackground(akfl... akflArr) {
        Intent.ShortcutIconResource shortcutIconResource;
        Account account;
        String a2;
        Bitmap bitmap;
        akfl akfl = akflArr[0];
        try {
            Intent.ShortcutIconResource shortcutIconResource2 = akfl.a;
            if (shortcutIconResource2 != null) {
                return a(akfl.e, shortcutIconResource2, akfl);
            }
            Uri uri = akfl.b;
            if (uri == null) {
                Log.e("BitmapWorker", "Error loading bitmap - no source!");
                return null;
            } else if (akeh.a(uri) || akeh.d(akfl.b)) {
                Context context = akfl.e;
                Uri uri2 = akfl.b;
                if (akeh.a(uri2)) {
                    shortcutIconResource = new Intent.ShortcutIconResource();
                    shortcutIconResource.packageName = uri2.getAuthority();
                    shortcutIconResource.resourceName = uri2.toString().substring(19).replaceFirst("/", ":");
                } else if (akeh.d(uri2)) {
                    shortcutIconResource = new Intent.ShortcutIconResource();
                    shortcutIconResource.packageName = uri2.getAuthority();
                    shortcutIconResource.resourceName = uri2.toString().substring(shortcutIconResource.packageName.length() + 26).replaceFirst("/", ":");
                } else {
                    String valueOf = String.valueOf(uri2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Invalid resource URI. ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                return a(context, shortcutIconResource, akfl);
            } else {
                Uri uri3 = akfl.b;
                String lowerCase = uri3.getScheme() != null ? uri3.getScheme().toLowerCase() : null;
                if (!"http".equals(lowerCase) && !"https".equals(lowerCase)) {
                    Uri uri4 = akfl.b;
                    if (!"content".equals(uri4.getScheme())) {
                        if (!"file".equals(uri4.getScheme())) {
                            if (akeh.b(akfl.b)) {
                                String c = akeh.c(akfl.b);
                                Context context2 = akfl.e;
                                if (c == null) {
                                    return null;
                                }
                                if (context2 != null) {
                                    Account[] accountsByType = AccountManager.get(context2).getAccountsByType("com.google");
                                    int length = accountsByType.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            account = null;
                                            break;
                                        }
                                        account = accountsByType[i];
                                        if (account.name.equals(c)) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (!(account == null || (a2 = akek.a(context2, account)) == null)) {
                                        akfk akfk = new akfk(context2);
                                        akfk.a(akfl.c);
                                        int i2 = akfl.d;
                                        if (i2 > 0) {
                                            akfk.b = i2;
                                            int i3 = akfl.f;
                                            Bitmap.Config config = akfl.g;
                                            akfk.a = Uri.parse(a2);
                                            akfj a3 = akfj.a(context2);
                                            akfl a4 = akfk.a();
                                            boolean b = akeh.b(a4.b);
                                            if (!b) {
                                                bitmap = a3.a(a4);
                                            } else {
                                                akej.a().a(a4);
                                                bitmap = null;
                                            }
                                            if (bitmap != null) {
                                                return bitmap;
                                            }
                                            return new akff(a3, b).doInBackground(a4);
                                        }
                                        StringBuilder sb2 = new StringBuilder(31);
                                        sb2.append("Can't set height to ");
                                        sb2.append(i2);
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                }
                                return null;
                            }
                            String valueOf2 = String.valueOf(akfl.b);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                            sb3.append("Error loading bitmap - unknown resource URI! ");
                            sb3.append(valueOf2);
                            Log.e("BitmapWorker", sb3.toString());
                            return null;
                        }
                    }
                    InputStream openInputStream = akfl.e.getContentResolver().openInputStream(akfl.b);
                    if (openInputStream != null) {
                        return a(openInputStream, akfl);
                    }
                    Log.w("BitmapWorker", "Content provider returned a null InputStream when trying to open resource.");
                    return null;
                }
                URLConnection openConnection = new URL(akfl.b.toString()).openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                return a(new BufferedInputStream(openConnection.getInputStream()), akfl);
            }
        } catch (IOException e2) {
            String valueOf3 = String.valueOf(akfl.b);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 18);
            sb4.append("Error loading url ");
            sb4.append(valueOf3);
            Log.e("BitmapWorker", sb4.toString(), e2);
            return null;
        } catch (RuntimeException e3) {
            String valueOf4 = String.valueOf(akfl.b);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 27);
            sb5.append("Critical Error loading url ");
            sb5.append(valueOf4);
            Log.e("BitmapWorker", sb5.toString(), e3);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap bitmap) {
        ImageView imageView;
        WeakReference weakReference = this.a;
        if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
