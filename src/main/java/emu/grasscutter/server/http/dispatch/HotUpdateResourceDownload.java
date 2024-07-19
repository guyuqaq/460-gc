package emu.grasscutter.server.http.dispatch;

public class HotUpdateResourceDownload {
  public static class Resource {
    public String resourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.7_live";
    
    public String dataUrl = "https://autopatchcn.yuanshen.com/client_design_data/4.7_live";
    
    public String resourceUrlBak = "4.7_live";
    
    public int clientDataVersion = 23781031;
    
    public int clientSilenceDataVersion = 23876922;
    
    public String clientDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"191e96fd7439b022f492337af8e97f12\", \"hash\": \"6351f4c11ea9e213\", \"fileSize\": 6656}\r\n{\"remoteName\": \"data_versions_medium\", \"md5\": \"1bf567c959aa126959ee37bdba24be0c\", \"hash\": \"5b7fb51d48d461c4\", \"fileSize\": 6656}";
    
    public String clientSilenceDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"3d2a8fcfd7788411f60507b877f5c64e\", \"hash\": \"92b9af2e7f542420\", \"fileSize\": 523}";
    
    public HotUpdateResourceDownload.ResVersionConfig resVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
    
    public String clientVersionSuffix = "458e047c08";
    
    public String clientSilenceVersionSuffix = "db530509c3";
    
    public String nextResourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.7_live";
    
    public HotUpdateResourceDownload.ResVersionConfig nextResVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
  }
  
  public static class ResVersionConfig {
    public int version = 23760009;
    
    public String md5 = "{\"remoteName\": \"base_revision\", \"md5\": \"a27d2b5a20ccfef2ea8075e904c1ab8f\", \"fileSize\": 19}";
    
    public String releaseTotalSize = "0";
    
    public String versionSuffix = "e0c5214301";
    
    public String branch = "4.7_live";
  }
}
