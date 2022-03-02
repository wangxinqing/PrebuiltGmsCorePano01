package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.io.IoUtils;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    static final Map caches = new HashMap();
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(FileClientSessionCache.class.getName());

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class CacheFile extends File {
        long lastModified = -1;
        final String name;

        public CacheFile(File file, String str) {
            super(file, str);
            this.name = str;
        }

        public int compareTo(File file) {
            long lastModified2 = lastModified() - file.lastModified();
            if (lastModified2 != 0) {
                return lastModified2 < 0 ? -1 : 1;
            }
            return super.compareTo(file);
        }

        public long lastModified() {
            long j = this.lastModified;
            if (j != -1) {
                return j;
            }
            long lastModified2 = super.lastModified();
            this.lastModified = lastModified2;
            return lastModified2;
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class Impl implements SSLClientSessionCache {
        Map accessOrder = newAccessOrder();
        final File directory;
        String[] initialFiles;
        int size;

        public Impl(File file) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    this.initialFiles = list;
                    if (list != null) {
                        Arrays.sort(list);
                        this.size = this.initialFiles.length;
                    } else {
                        String valueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                        sb.append(valueOf);
                        sb.append(" exists but cannot list contents.");
                        throw new IOException(sb.toString());
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                    sb2.append(valueOf2);
                    sb2.append(" exists but is not a directory.");
                    throw new IOException(sb2.toString());
                }
            } else if (file.mkdirs()) {
                this.size = 0;
            } else {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 30);
                sb3.append("Creation of ");
                sb3.append(valueOf3);
                sb3.append(" directory failed.");
                throw new IOException(sb3.toString());
            }
            this.directory = file;
        }

        private void delete(File file) {
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("FileClientSessionCache: Failed to delete ");
                sb.append(valueOf);
                sb.append(".");
                IOException iOException = new IOException(sb.toString());
                FileClientSessionCache.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "delete", iOException.getMessage(), iOException);
            }
            this.size--;
        }

        private static String fileName(String str, int i) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(str.length() + 12);
                sb.append(str);
                sb.append(".");
                sb.append(i);
                return sb.toString();
            }
            throw new NullPointerException("host == null");
        }

        private void indexFiles() {
            String[] strArr = this.initialFiles;
            if (strArr != null) {
                this.initialFiles = null;
                TreeSet<CacheFile> treeSet = new TreeSet<>();
                for (String str : strArr) {
                    if (!this.accessOrder.containsKey(str)) {
                        treeSet.add(new CacheFile(this.directory, str));
                    }
                }
                if (!treeSet.isEmpty()) {
                    Map newAccessOrder = newAccessOrder();
                    for (CacheFile cacheFile : treeSet) {
                        newAccessOrder.put(cacheFile.name, cacheFile);
                    }
                    newAccessOrder.putAll(this.accessOrder);
                    this.accessOrder = newAccessOrder;
                }
            }
        }

        static void logReadError(String str, File file, Throwable th) {
            Logger access$000 = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 62 + String.valueOf(valueOf).length());
            sb.append("FileClientSessionCache: Error reading session data for ");
            sb.append(str);
            sb.append(" from ");
            sb.append(valueOf);
            sb.append(".");
            access$000.logp(level, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logReadError", sb.toString(), th);
        }

        static void logWriteError(String str, File file, Throwable th) {
            Logger access$000 = FileClientSessionCache.logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(valueOf).length());
            sb.append("FileClientSessionCache: Error writing session data for ");
            sb.append(str);
            sb.append(" to ");
            sb.append(valueOf);
            sb.append(".");
            access$000.logp(level, "com.google.android.gms.org.conscrypt.FileClientSessionCache$Impl", "logWriteError", sb.toString(), th);
        }

        private void makeRoom() {
            if (this.size > 12) {
                indexFiles();
                int i = this.size - 12;
                Iterator it = this.accessOrder.values().iterator();
                do {
                    delete((File) it.next());
                    it.remove();
                    i--;
                } while (i > 0);
            }
        }

        private static Map newAccessOrder() {
            return new LinkedHashMap(12, 0.75f, true);
        }

        /* JADX INFO: finally extract failed */
        public synchronized byte[] getSessionData(String str, int i) {
            String fileName = fileName(str, i);
            File file = (File) this.accessOrder.get(fileName);
            if (file == null) {
                String[] strArr = this.initialFiles;
                if (strArr != null && Arrays.binarySearch(strArr, fileName) >= 0) {
                    file = new File(this.directory, fileName);
                    this.accessOrder.put(fileName, file);
                }
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[((int) file.length())];
                    new DataInputStream(fileInputStream).readFully(bArr);
                    IoUtils.closeQuietly((Closeable) fileInputStream);
                    return bArr;
                } catch (IOException e) {
                    try {
                        logReadError(str, file, e);
                        IoUtils.closeQuietly((Closeable) fileInputStream);
                        return null;
                    } catch (Throwable th) {
                        IoUtils.closeQuietly((Closeable) fileInputStream);
                        throw th;
                    }
                }
            } catch (FileNotFoundException e2) {
                logReadError(str, file, e2);
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            delete(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            delete(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0062, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0064, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            logWriteError(r0, r1, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            throw r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x006a, code lost:
            delete(r1);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:20:0x003a, B:31:0x0049] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x003d=Splitter:B:22:0x003d, B:43:0x005e=Splitter:B:43:0x005e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void putSessionData(javax.net.ssl.SSLSession r5, byte[] r6) {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = r5.getPeerHost()     // Catch:{ all -> 0x007c }
                if (r6 == 0) goto L_0x0074
                int r5 = r5.getPeerPort()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = fileName(r0, r5)     // Catch:{ all -> 0x007c }
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007c }
                java.io.File r2 = r4.directory     // Catch:{ all -> 0x007c }
                r1.<init>(r2, r5)     // Catch:{ all -> 0x007c }
                boolean r2 = r1.exists()     // Catch:{ all -> 0x007c }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006e }
                r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x006e }
                if (r2 != 0) goto L_0x002a
                int r2 = r4.size     // Catch:{ all -> 0x007c }
                int r2 = r2 + 1
                r4.size = r2     // Catch:{ all -> 0x007c }
                r4.makeRoom()     // Catch:{ all -> 0x007c }
            L_0x002a:
                r3.write(r6)     // Catch:{ IOException -> 0x0048 }
                r3.close()     // Catch:{ IOException -> 0x0039 }
                java.util.Map r6 = r4.accessOrder     // Catch:{ all -> 0x007c }
                r6.put(r5, r1)     // Catch:{ all -> 0x007c }
                monitor-exit(r4)
                return
            L_0x0037:
                r5 = move-exception
                goto L_0x0042
            L_0x0039:
                r5 = move-exception
                logWriteError(r0, r1, r5)     // Catch:{ all -> 0x0037 }
            L_0x003d:
                r4.delete(r1)     // Catch:{ all -> 0x007c }
                monitor-exit(r4)
                return
            L_0x0042:
                r4.delete(r1)     // Catch:{ all -> 0x007c }
            L_0x0045:
                throw r5     // Catch:{ all -> 0x007c }
            L_0x0046:
                r5 = move-exception
                goto L_0x005b
            L_0x0048:
                r5 = move-exception
                logWriteError(r0, r1, r5)     // Catch:{ all -> 0x0046 }
                r3.close()     // Catch:{ IOException -> 0x0052 }
                goto L_0x003d
            L_0x0050:
                r5 = move-exception
                goto L_0x0057
            L_0x0052:
                r5 = move-exception
                logWriteError(r0, r1, r5)     // Catch:{ all -> 0x0050 }
                goto L_0x003d
            L_0x0057:
                r4.delete(r1)     // Catch:{ all -> 0x007c }
                goto L_0x0045
            L_0x005b:
                r3.close()     // Catch:{ IOException -> 0x0064 }
            L_0x005e:
                r4.delete(r1)     // Catch:{ all -> 0x007c }
                goto L_0x0069
            L_0x0062:
                r5 = move-exception
                goto L_0x006a
            L_0x0064:
                r6 = move-exception
                logWriteError(r0, r1, r6)     // Catch:{ all -> 0x0062 }
                goto L_0x005e
            L_0x0069:
                throw r5     // Catch:{ all -> 0x007c }
            L_0x006a:
                r4.delete(r1)     // Catch:{ all -> 0x007c }
                goto L_0x0045
            L_0x006e:
                r5 = move-exception
                logWriteError(r0, r1, r5)     // Catch:{ all -> 0x007c }
                monitor-exit(r4)
                return
            L_0x0074:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ all -> 0x007c }
                java.lang.String r6 = "sessionData == null"
                r5.<init>(r6)     // Catch:{ all -> 0x007c }
                throw r5     // Catch:{ all -> 0x007c }
            L_0x007c:
                r5 = move-exception
                monitor-exit(r4)
                goto L_0x0080
            L_0x007f:
                throw r5
            L_0x0080:
                goto L_0x007f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.FileClientSessionCache.Impl.putSessionData(javax.net.ssl.SSLSession, byte[]):void");
        }
    }

    private FileClientSessionCache() {
    }

    static synchronized void reset() {
        synchronized (FileClientSessionCache.class) {
            caches.clear();
        }
    }

    public static synchronized SSLClientSessionCache usingDirectory(File file) {
        Impl impl;
        synchronized (FileClientSessionCache.class) {
            impl = (Impl) caches.get(file);
            if (impl == null) {
                impl = new Impl(file);
                caches.put(file, impl);
            }
        }
        return impl;
    }
}
