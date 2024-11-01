class Song():
    def __init__(self, name, autor, album):
        self.name = name
        self.autor = autor
        self.album = album

    def songname(self):
        print(f'la canción es {self.name}.')

    def songautor(self):
        print(f'su autor es {self.autor}.')

    def songalbum(self):
        print(f'su album es {self.album}.')

MySong = Song('I Wonder', 'Kanye West', 'Graduation')

MySong.songname()
MySong.songautor()
MySong.songalbum()