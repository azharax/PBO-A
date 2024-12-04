public class Main {
    public static void main(String[] args) { 
        // Buat Network 
        Network network = new Network(); 
        
        // Tambah pengguna 
        User alice = network.addUser("Alice"); 
        User bob = network.addUser("Bob"); 
        
        // Pengguna membuat postingan 
        alice.addPost("Hello, this is Alice's first post!");
        bob.addPost("Hi everyone, Bob here!"); 
        
        // Simpan postingan ke Network 
        network.addPost(alice.getPosts().get(0)); 
        network.addPost(bob.getPosts().get(0)); 
        
        // Pengguna menyukai postingan 
        bob.likePost(alice.getPosts().get(0));
        alice.likePost(bob.getPosts().get(0)); 
        
        // Tampilkan semua postingan di network 
        network.showAllPosts(); 
    } 
}