package emu.grasscutter.server.http.dispatch;

public class HotUpdateResourceDownload {
  public static class Resource {
    public String resourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.0_live";
    
    public String dataUrl = "https://autopatchcn.yuanshen.com/client_design_data/4.0_live";
    
    public String resourceUrlBak = "4.0_live";
    
    public int clientDataVersion = 17940433;
    
    public int clientSilenceDataVersion = 17600751;
    
    public String clientDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"084dc343e6917321cf2d211c5584cbe6\", \"fileSize\": 5148}";
    
    public String clientSilenceDataMd5 = "{\"remoteName\": \"data_versions\", \"md5\": \"3df8eee89d4c0fa3980788686a558c50\", \"fileSize\": 411}";
    
    public HotUpdateResourceDownload.ResVersionConfig resVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
    
    public String clientVersionSuffix = "9710a8a048";
    
    public String clientSilenceVersionSuffix = "bcabfa630d";
    
    public String nextResourceUrl = "https://autopatchcn.yuanshen.com/client_game_res/4.0_live";
    
    public HotUpdateResourceDownload.ResVersionConfig nextResVersionConfig = new HotUpdateResourceDownload.ResVersionConfig();
  }
  
  public static class ResVersionConfig {
    public int version = 17742988;
    
    public String md5 = "{\"remoteName\": \"base_revision\", \"md5\": \"7c0a3453e69c4f308a04df3520dfc92a\",\"fileSize\": 19}";
    
    public String releaseTotalSize = "0";
    
    public String versionSuffix = "0f2b2dcb73";
    
    public String branch = "4.0_live";
  }
}